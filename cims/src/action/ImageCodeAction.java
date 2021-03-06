package action;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Random;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class ImageCodeAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private InputStream is;
	private String verificationCode;
	private boolean checkResult = false;

	/**
	 * Action调用的方法，生成一个验证码图片IO流
	 * @return
	 * @throws Exception
	 */
	public String genImageCode() throws Exception {
		byte[] bs = generator();
		is = new ByteArrayInputStream(bs);
		return SUCCESS;
	}
	
	/**
	 * 检验验证码
	 * @return
	 */
	public String validateCode(){
		checkResult = false;
		StringBuffer sessionCode = (StringBuffer) session.get("verificationCode");
		if(sessionCode != null && sessionCode.toString().equalsIgnoreCase(verificationCode)){
			checkResult = true;
		}
		return "validatecode";
	}

	private static int WIDTH = 110;

	private static int HEIGHT = 28;

	private static int NUM = 4;

	private static char[] seq = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
			'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8',
			'9' };

	/**
	 * 生成随机的验证码
	 * 
	 * @return
	 * @throws Exception
	 */
	private byte[] generator() throws Exception {
		Random r = new Random();

		// 图片的内存映像
		BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

		// 获得画笔对象
		Graphics g = image.getGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setColor(new Color(0, 0, 0));

		// 用于存储随机生成的验证码
		StringBuffer number = new StringBuffer();

		// 绘制验证码
		for (int i = 0; i < NUM; i++) {
			g.setColor(randomColor(r));
			int h = (int) ((HEIGHT * 60 / 100) * r.nextDouble() + (HEIGHT * 30 / 100));
			g.setFont(new Font(null, Font.BOLD | Font.ITALIC, 20));
			String ch = String.valueOf(seq[r.nextInt(seq.length)]);
			number.append(ch);
			g.drawString(ch, i * WIDTH / NUM * 90 / 100, 20);
		}
		
		//将验证码保存至session
		session.put("verificationCode", number);

		// 绘制干扰线
		for (int i = 0; i <= 3; i++) {
			g.setColor(randomColor(r));
			g.drawLine(r.nextInt(WIDTH), r.nextInt(HEIGHT), r.nextInt(WIDTH), r
					.nextInt(HEIGHT));
		}

		// 压缩成jpeg格式
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(os);

		// 把BufferedImage对象中的图像信息编码后
		// 向创建该对象(encoder)时指定的输出流输出
		encoder.encode(image);

		return os.toByteArray();
	}

	private Color randomColor(Random r) {
		return new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));

	}

	public InputStream getIs() {
		return is;
	}

	public void setIs(InputStream is) {
		this.is = is;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public boolean isCheckResult() {
		return checkResult;
	}

	public void setCheckResult(boolean checkResult) {
		this.checkResult = checkResult;
	}
	
}