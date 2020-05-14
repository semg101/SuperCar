package com.ds.supercar.repository.usermodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.supercar.model.usermodel.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int save(Employee employee) {
		
		return (Integer)ht.save(employee);
	}

	@Override
	public boolean update(Employee employee) {
		ht.update(employee);
		return true;
	}

	@Override
	public boolean delete(Employee employee) {
		ht.delete(employee);
		return true;
	}

	@Override
	public Employee find(int id) {
		
		return (Employee)ht.get(Employee.class, id);
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAll() {
		
		return ht.find("from User");
	}

}
