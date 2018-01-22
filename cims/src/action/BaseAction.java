package action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements SessionAware,RequestAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7739024285687722990L;
	protected Map<String, Object> session;
	protected Map<String, Object> request;

	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

	public void setRequest(Map<String, Object> arg0) {
		this.request = arg0;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public Map<String, Object> getRequest() {
		return request;
	}
	
}
