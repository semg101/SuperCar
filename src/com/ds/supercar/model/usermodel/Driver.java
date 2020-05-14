package com.ds.supercar.model.usermodel;

import java.util.Date;
import java.util.Set;

import com.ds.supercar.model.places.Branch;

public class Driver extends Employee 
{
	private String licensenumber;

	

	public Driver() {
	}
	
	public Driver(int userid, String username, String password, Date dob, String gender, Set<Address> addresses,
			Date joindate, String role, Branch branch, String licensenumber) {
		super(userid, username, password, dob, gender, addresses, joindate, role, branch);
		this.licensenumber = licensenumber;
	}
	public String getLicensenumber() {
		return licensenumber;
	}
	public void setLicencenumber(String licensenumber) {
		this.licensenumber = licensenumber;
	}
	
	
}
