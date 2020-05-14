package com.ds.supercar.repository.bo.locationbo;

import java.util.List;

import com.ds.supercar.model.places.Branch;


public interface BranchBo 
{
	public int createBranch(Branch branch)throws Exception;
	public boolean updateBranch(Branch branch)throws Exception;
	public boolean deleteBranch(Branch branch)throws Exception;
	public Branch findBranch(int id)throws Exception;
	public List<Branch> findAllBranches()throws Exception;
}
