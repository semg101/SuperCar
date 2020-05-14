package com.ds.supercar.web.location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds.supercar.model.places.Branch;
import com.ds.supercar.repository.bo.locationbo.BranchBo;

@Controller
public class BranchContoller 
{
	@Autowired
	private BranchBo branchBo;
	
	@RequestMapping(params = "/createBranch.htm", method = RequestMethod.POST)
	public @ResponseBody Branch createBranch(@RequestBody Branch br)throws Exception
	{
		Branch b = new Branch();
		
		int id = branchBo.createBranch(br);
		
		if(id != 0)
		{
			return br;
		}
		else
		{
			return b;
		}

	}
	
	@RequestMapping(params = "/updateBranch.htm", method = RequestMethod.POST)
	public @ResponseBody Branch updateBranch(@RequestBody Branch br)throws Exception
	{	
		boolean b = branchBo.updateBranch(br);
		
		if(b == true)
		{
			return br;
		}
		else{
			return new Branch();
		}

	}
	
	@RequestMapping(params = "/deleteBranch.htm", method = RequestMethod.POST)
	public @ResponseBody boolean deleteBranch(@PathVariable(value = "id") int id)throws Exception
	{
		Branch b = new Branch();
		b.setBranchid(id);
		boolean bval = branchBo.deleteBranch(b);
		return bval;
	}
	@RequestMapping(params = "/findBranch.htm", method = RequestMethod.GET)
		public @ResponseBody Branch findBranch(@PathVariable(value = "id") int id)throws Exception
		{
			Branch bar = branchBo.findBranch(id);
			return bar;
		}
	
	@RequestMapping(params = "/findAllBranches.htm", method = RequestMethod.GET)
	public @ResponseBody List<Branch> findAllBranches()throws Exception
	{
		return branchBo.findAllBranches();
	}
}
