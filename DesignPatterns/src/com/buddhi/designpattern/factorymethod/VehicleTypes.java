package com.buddhi.designpattern.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class VehicleTypes {
	
	protected  List<Car> cars = new ArrayList<Car>();
	
	public VehicleTypes() {
		createVehicleType();
	}

	protected abstract void createVehicleType();
	
	public String toString() {
		return "Package{" + "Vehicle Type : " + cars + " }";
	}

}
