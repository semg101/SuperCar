package com.ds.supercar.model.transaction;

import java.util.Date;

import com.ds.supercar.model.places.Location;
import com.ds.supercar.model.usermodel.User;
import com.ds.supercar.model.vehicle.Car;

public class BookingRecord 
{
	private int bookingid;
	private Location source;//many-to-one
	private Location destination;//many-to-one
	private User user;//many-to-one
	private Car car;//many-to-one
	private Timesheet timesheet;//many-to-one
	private Date dateofjourney;
	private int distance;
	private int numberofpassengers;
	private byte driver_flag;
	private byte confirm_flag;
	
	
	public BookingRecord() {
	}
	
	
	public BookingRecord(int bookingid, Location source, Location destination, User user, Car car, Timesheet timesheet,
			Date dateofjourney, int distance, int numberofpassengers, byte driver_flag, byte confirm_flag) {
		super();
		this.bookingid = bookingid;
		this.source = source;
		this.destination = destination;
		this.user = user;
		this.car = car;
		this.timesheet = timesheet;
		this.dateofjourney = dateofjourney;
		this.distance = distance;
		this.numberofpassengers = numberofpassengers;
		this.driver_flag = driver_flag;
		this.confirm_flag = confirm_flag;
	}


	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public Location getSource() {
		return source;
	}
	public void setSource(Location source) {
		this.source = source;
	}
	public Location getDestination() {
		return destination;
	}
	public void setDestination(Location destination) {
		this.destination = destination;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Timesheet getTimesheet() {
		return timesheet;
	}
	public void setTimesheet(Timesheet timesheet) {
		this.timesheet = timesheet;
	}
	public Date getDateofjourney() {
		return dateofjourney;
	}
	public void setDateofjourney(Date dateofjourney) {
		this.dateofjourney = dateofjourney;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getNumberofpassengers() {
		return numberofpassengers;
	}
	public void setNumberofpassengers(int numberofpassengers) {
		this.numberofpassengers = numberofpassengers;
	}
	public byte getDriver_flag() {
		return driver_flag;
	}
	public void setDriver_flag(byte driver_flag) {
		this.driver_flag = driver_flag;
	}
	public byte getConfirm_flag() {
		return confirm_flag;
	}
	public void setConfirm_flag(byte confirm_flag) {
		this.confirm_flag = confirm_flag;
	}
}
