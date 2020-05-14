package com.ds.supercar.repository.bo.locationbo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ds.supercar.model.places.Branch;
import com.ds.supercar.repository.locationrepository.BranchDao;

@Service
@Transactional
public class BranchBoImpl implements BranchBo {

	@Autowired
	private BranchDao dao;
	
	@Override
	public int createBranch(Branch branch) throws Exception {
		
		return dao.save(branch);
	}

	@Override
	public boolean updateBranch(Branch branch) throws Exception {
		
		return dao.update(branch);
	}

	@Override
	public boolean deleteBranch(Branch branch) throws Exception {
		
		return dao.delete(branch);
	}

	@Override
	public Branch findBranch(int id) throws Exception {
		
		return dao.findBranch(id);
	}

	@Override
	public List<Branch> findAllBranches() throws Exception {
		
		return dao.findAllBranch();
	}

}
