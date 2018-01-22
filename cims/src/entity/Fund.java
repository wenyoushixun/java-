package entity;

import java.sql.Date;

/**
 * 班费管理实体类
 */

public class Fund implements java.io.Serializable {

	private static final long serialVersionUID = -3442138518673653369L;
	private Integer fundId;
	/** 收支类别：1、收入；-1、支出*/
	private Integer type;
	private Double count;
	private String describ;
	private Date occurDate;
	private Double balance;

	public Fund() {
	}

	public Fund(Integer type, Double count, String describ, Date occurDate,
			Double balance) {
		this.type = type;
		this.count = count;
		this.describ = describ;
		this.occurDate = occurDate;
		this.balance = balance;
	}


	public Integer getFundId() {
		return this.fundId;
	}

	public void setFundId(Integer fundId) {
		this.fundId = fundId;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Double getCount() {
		return this.count;
	}

	public void setCount(Double count) {
		this.count = count;
	}

	public String getDescrib() {
		return this.describ;
	}

	public void setDescrib(String describ) {
		this.describ = describ;
	}

	public Date getOccurDate() {
		return this.occurDate;
	}

	public void setOccurDate(Date occurDate) {
		this.occurDate = occurDate;
	}

	public Double getBalance() {
		return this.balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

}