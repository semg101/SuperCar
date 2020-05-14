package com.ds.supercar.model.transaction;

import com.ds.supercar.model.payment.Payment;

public class Confirmation 
{
	private int ccrid;
	private BookingRecord bookingRecord;//one-to-one
	private Payment payment;//one-to-one
	private byte ccr_flag;//note we are using 3 flags 1 to confirm 2 to cancel 3 to return
	
	public Confirmation() {
	}

	public Confirmation(int ccrid, BookingRecord bookingRecord, Payment payment, byte ccr_flag) {
		super();
		this.ccrid = ccrid;
		this.bookingRecord = bookingRecord;
		this.payment = payment;
		this.ccr_flag = ccr_flag;
	}

	public int getCcrid() {
		return ccrid;
	}
	public void setCcrid(int ccrid) {
		this.ccrid = ccrid;
	}

	public BookingRecord getBookingRecord() {
		return bookingRecord;
	}
	public void setBookingRecord(BookingRecord bookingRecord) {
		this.bookingRecord = bookingRecord;
	}

	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public byte getCcr_flag() {
		return ccr_flag;
	}
	public void setCcr_flag(byte ccr_flag) {
		this.ccr_flag = ccr_flag;
	}
	
	
}
