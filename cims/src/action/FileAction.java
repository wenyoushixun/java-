package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import entity.ShareFile;
import entity.Student;

import biz.ShareFileService;

public class FileAction extends BaseAction{
	
	private static final long serialVersionUID = 3264078035919372897L;
	private File file;//
	private InputStream is;
	private String fileFileName;
	private String filePath;
	private ShareFile shareFile;
	private List<ShareFile> files;
	@Resource
	private ShareFileService fileService;
	private int status;
	
	/**
	 * 添加共享文件
	 * @return
	 * @throws Exception
	 */
	public String saveNewFile(){
		//<input type="file" name="productPic"/>
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			String realPath = ServletActionContext.getServletContext().getRealPath("/");
			fos = new FileOutputStream(realPath+"\\share\\"+getFileFileName());
			fis = new FileInputStream(getFile());
			byte[] buf = new byte[1024];
			int len = 0;
			while((len = fis.read(buf)) > 0){
				fos.write(buf, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fos != null)fos.close();
				if(fis != null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Student student = (Student) session.get("currStudent");
		shareFile.setStudent(student );
		shareFile.setFileName(getFileFileName());
		try {
			fileService.saveShareFile(shareFile);
		} catch (Exception e) {
			e.printStackTrace();
			status = -1;
			return "savedProduct";
		}
		status = 1;
		return "savedProduct";
	}
	
	/**
	 * 更新共享文件
	 * @return
	 */
	public String updateFile(){
		FileOutputStream fos = null;
		FileInputStream fis = null;
		if(fileFileName != null){
			try {
				String realPath = ServletActionContext.getServletContext().getRealPath("/");
				fos = new FileOutputStream(realPath+"\\share\\"+getFileFileName());
				fis = new FileInputStream(getFile());
				byte[] buf = new byte[1024];
				int len = 0;
				while((len = fis.read(buf)) > 0){
					fos.write(buf, 0, len);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				try {
					if(fos != null)fos.close();
					if(fis != null)fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			shareFile.setFileName(getFileFileName());
		}
		try {
			fileService.updateShareFile(shareFile, status);
		} catch (Exception e) {
			e.printStackTrace();
			status = -1;
			return "updated";
		}
		status = 1;
		return "updated";
	}
	
	public String toFileMgr(){
		files = fileService.findAllFiles();
		return "fileMgr";
	}
	
	public String myFiles(){
		Student student = (Student) session.get("currStudent");
		files = fileService.findMyFiles(student.getStudentId());
		return "myfiles";
	}
	
	public String fileDiv(){
		files = fileService.findAllFiles();
		return "filediv";
	}
	
	public String toFileDetail(){
		shareFile = fileService.findShareFile(status);
		return "detail";
	}
	
	public String toUpdateFile(){
		shareFile =fileService.findShareFile(status);
		return "updatePage";
	}
	
	/**
	 * 下载文件
	 * @return
	 * @throws IOException 
	 */
	public String download() throws IOException{
		String realPath = ServletActionContext.getServletContext().getRealPath("/");
		ShareFile sf = fileService.findShareFile(status);
		File downFile = new File(realPath+"\\share\\"+sf.getFileName());
		is = new FileInputStream(downFile);
		return "download";
	}
	
	public String deleteFile(){
		try {
			fileService.deleteFile(status);;
		} catch (Exception e) {
			e.printStackTrace();
			status = -1;
			return "deleted";
		}
		status = 1;
		return "deleted";
	}
	
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public ShareFile getShareFile() {
		return shareFile;
	}

	public void setShareFile(ShareFile shareFile) {
		this.shareFile = shareFile;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<ShareFile> getFiles() {
		return files;
	}

	public void setFiles(List<ShareFile> files) {
		this.files = files;
	}

	public InputStream getIs() {
		return is;
	}

	public void setIs(InputStream is) {
		this.is = is;
	}
	
}
