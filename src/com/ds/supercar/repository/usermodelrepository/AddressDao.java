package com.ds.supercar.repository.usermodelrepository;

import java.util.List;

import com.ds.supercar.model.usermodel.Address;

public interface AddressDao 
{
	public int save( final Address address)throws Exception;
	public boolean update(final Address address)throws Exception;
	public boolean delete(final Address address)throws Exception;
	public Address find(final String email)throws Exception;
	public List<Address> findAll()throws Exception;
}
