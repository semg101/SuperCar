package com.ds.supercar.model.vehicle;

public class FuelType 
{
	private int fueltypeid;
	private String fueltype_name;
	private String fueltype_desc;
	
	
	public FuelType() {
	}


	public FuelType(int fueltypeid, String fueltype_name, String fueltype_desc) {
		super();
		this.fueltypeid = fueltypeid;
		this.fueltype_name = fueltype_name;
		this.fueltype_desc = fueltype_desc;
	}


	public int getFueltypeid() {
		return fueltypeid;
	}


	public void setFueltypeid(int fueltypeid) {
		this.fueltypeid = fueltypeid;
	}


	public String getFueltype_name() {
		return fueltype_name;
	}


	public void setFueltype_name(String fueltype_name) {
		this.fueltype_name = fueltype_name;
	}


	public String getFueltype_desc() {
		return fueltype_desc;
	}


	public void setFueltype_desc(String fueltype_desc) {
		this.fueltype_desc = fueltype_desc;
	}
	
	
	
	
}
