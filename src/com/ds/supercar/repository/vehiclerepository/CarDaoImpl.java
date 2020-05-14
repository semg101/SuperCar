package com.ds.supercar.repository.vehiclerepository;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.supercar.model.vehicle.Car;


@Repository
public class CarDaoImpl implements CarDao {

	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public int save(Car car) throws Exception {
		
		return (Integer)ht.save(car);
	}

	@Override
	public boolean update(Car car) throws Exception {
		ht.update(car);
		return true;
	}

	@Override
	public boolean delete(Car car) throws Exception {
		ht.delete(car);
		return true;
	}

	@Override
	public Car find(int id) throws Exception {
		
		return (Car)ht.get(Car.class, id);
	}

	@Override
	public List<Car> findAll() throws Exception {
		@SuppressWarnings("unchecked")
		List<Car> list = ht.find("from Car");
		return list;
	}

}
