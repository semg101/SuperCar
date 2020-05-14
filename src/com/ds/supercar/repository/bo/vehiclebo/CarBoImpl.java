package com.ds.supercar.repository.bo.vehiclebo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ds.supercar.model.vehicle.Car;
import com.ds.supercar.repository.vehiclerepository.CarDao;

@Service
@Transactional
public class CarBoImpl implements CarBo {
	
	@Autowired
	private CarDao dao; 

	@Override
	public int createCar(Car car) throws Exception {
		
		return dao.save(car);
	}

	@Override
	public boolean updateCar(Car car) throws Exception {
		
		return dao.update(car);
	}

	@Override
	public boolean deleteCar(Car car) throws Exception {
		
		return dao.delete(car);
	}

	@Override
	public Car selectCar(int id) throws Exception {
		
		return dao.find(id);
	}

	@Override
	public List<Car> selectAllCars() throws Exception {
		
		return dao.findAll();
	}

}
