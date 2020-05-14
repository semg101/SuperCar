package com.ds.supercar.model.transaction;

import java.util.Date;

import com.ds.supercar.model.payment.Payment;
import com.ds.supercar.model.usermodel.User;

public class CarSellingRecord 
{
	private int carsellingid;
	private User user;//many-to-one
	private Payment payment;//many-to-one
	private Date dateofsale;
	private CarForSaleRecord carForSaleRecord;//one-to-one
	
	
	public CarSellingRecord() {
	}
	
	
	public CarSellingRecord(int carsellingid, User user, Payment payment, Date dateofsale,
			CarForSaleRecord carForSaleRecord) {
		super();
		this.carsellingid = carsellingid;
		this.user = user;
		this.payment = payment;
		this.dateofsale = dateofsale;
		this.carForSaleRecord = carForSaleRecord;
	}


	public int getCarsellingid() {
		return carsellingid;
	}
	public void setCarsellingid(int carsellingid) {
		this.carsellingid = carsellingid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Date getDateofsale() {
		return dateofsale;
	}
	public void setDateofsale(Date dateofsale) {
		this.dateofsale = dateofsale;
	}
	public CarForSaleRecord getCarForSaleRecord() {
		return carForSaleRecord;
	}
	public void setCarForSaleRecord(CarForSaleRecord carForSaleRecord) {
		this.carForSaleRecord = carForSaleRecord;
	}
}
