package cn.itcast.user.util;

public enum ResultCode {
		/**
		 * 成功 
		 */
		SUCCESS(200,"成功"),
		
		NO_USER(98,"用户不存在"),
		
		FAIL(300,"失败");
		
		private int code;
		private String desc;
		
		private ResultCode(int code,String desc) {
	        this.code = code;
	        this.desc = desc;
	    }
		
		public int getCode() {
			return code;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String toString(){
			return code+":"+desc;
		}
}
