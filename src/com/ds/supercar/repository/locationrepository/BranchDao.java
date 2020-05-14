package com.ds.supercar.repository.locationrepository;

import java.util.List;

import com.ds.supercar.model.places.Branch;


public interface BranchDao 
{
	public int save( final Branch branch)throws Exception;
	public boolean update(final Branch branch)throws Exception;
	public boolean delete(final Branch branch)throws Exception;
	public Branch findBranch(final int id)throws Exception;
	public List<Branch> findAllBranch()throws Exception;
}
