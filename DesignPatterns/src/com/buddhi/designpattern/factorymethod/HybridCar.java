package com.buddhi.designpattern.factorymethod;

public class HybridCar extends VehicleTypes {

	@Override
	protected void createVehicleType() {

		cars.add(new VolkswagenJetta());
	}
	

}
