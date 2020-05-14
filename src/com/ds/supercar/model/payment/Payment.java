package com.ds.supercar.model.payment;

import java.util.Date;

public class Payment
{
	private int paymentid;
	private int amount;
	private Date txtime;
	private PaymentType paymenttype;//many-to-one
	
	
	public Payment() {
	}


	public Payment(int paymentid, int amount, Date txtime, PaymentType paymenttype) {
		super();
		this.paymentid = paymentid;
		this.amount = amount;
		this.txtime = txtime;
		this.paymenttype = paymenttype;
	}


	public int getPaymentid() {
		return paymentid;
	}


	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public Date getTxtime() {
		return txtime;
	}


	public void setTxtime(Date txtime) {
		this.txtime = txtime;
	}


	public PaymentType getPaymenttype() {
		return paymenttype;
	}


	public void setPaymenttype(PaymentType paymenttype) {
		this.paymenttype = paymenttype;
	}
	
	
}
