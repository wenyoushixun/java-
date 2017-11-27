package cn.itcast.user.bean;

import java.util.List;

import com.github.pagehelper.PageInfo;

public class EasyUIResult<T> {

	private PageInfo<T> pageInfo;

	private List<?> rows;

	public EasyUIResult() {
	}

	public EasyUIResult(PageInfo<T> pageInfo, List<?> rows) {
		this.pageInfo = pageInfo;
		this.rows = rows;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

	public PageInfo<T> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<T> pageInfo) {
		this.pageInfo = pageInfo;
	}

}
