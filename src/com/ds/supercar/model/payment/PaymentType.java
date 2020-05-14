package com.ds.supercar.model.payment;

public class PaymentType 
{
	private int paymenttypeid;
	private String descr;
	
	public PaymentType() {
	}

	public PaymentType(int paymenttypeid, String descr) {
		super();
		this.paymenttypeid = paymenttypeid;
		this.descr = descr;
	}

	public int getPaymenttypeid() {
		return paymenttypeid;
	}

	public void setPaymenttypeid(int paymenttypeid) {
		this.paymenttypeid = paymenttypeid;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}
	
	
}
