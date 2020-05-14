package com.ds.supercar.repository.usermodelrepository;

import java.util.List;

import com.ds.supercar.model.usermodel.Driver;

public interface DriverDao 
{
	public int save( final Driver driver)throws Exception;
	public boolean update(final Driver driver)throws Exception;
	public boolean delete(final Driver driver)throws Exception;
	public Driver find(final int id)throws Exception;
	public List<Driver> findAll()throws Exception;
}
