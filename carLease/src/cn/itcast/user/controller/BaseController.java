package cn.itcast.user.controller;

import com.alibaba.fastjson.JSONObject;

import cn.itcast.user.util.ResultCode;

public class BaseController {
	public JSONObject result(ResultCode code) {
		return result(code, null);
	}
	
	public JSONObject result(ResultCode code, Object data) {
		JSONObject result = new JSONObject();
		result.put("statusCode", code.getCode());
		result.put("message", code.getDesc());
		result.put("data", data);

		return result;
	}
	
	public JSONObject result(ResultCode code,Object data,int relId) {
		JSONObject result =result(code, data);
		result.put("navTabId", "");
		result.put("forwardUrl", "");
		result.put("callbackType", "");
		result.put("rel", "");
		return result;
	}
	
	
	
}
