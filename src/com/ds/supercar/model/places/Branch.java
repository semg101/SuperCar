package com.ds.supercar.model.places;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlElement
public class Branch 
{
	private int branchid;
	private String name;
	private String contact;
	private String faxnumber;
	private Location location;
	
	
	public Branch() {
	}


	public Branch(int branchid, String name, String contact, String faxnumber, Location location) {
		super();
		this.branchid = branchid;
		this.name = name;
		this.contact = contact;
		this.faxnumber = faxnumber;
		this.location = location;
	}


	public int getBranchid() {
		return branchid;
	}


	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getFaxnumber() {
		return faxnumber;
	}


	public void setFaxnumber(String faxnumber) {
		this.faxnumber = faxnumber;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}
	
	
	
	
	
	
}
