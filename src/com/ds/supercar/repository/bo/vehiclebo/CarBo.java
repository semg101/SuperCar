package com.ds.supercar.repository.bo.vehiclebo;

import java.util.List;

import com.ds.supercar.model.vehicle.Car;


public interface CarBo 
{
	public int createCar(Car car)throws Exception;
	public boolean updateCar(Car car)throws Exception;
	public boolean deleteCar(Car car)throws Exception;
	public Car selectCar(int id)throws Exception;
	public List<Car> selectAllCars()throws Exception;
}
