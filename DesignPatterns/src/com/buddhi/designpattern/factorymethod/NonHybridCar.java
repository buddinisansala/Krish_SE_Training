package com.buddhi.designpattern.factorymethod;

public class NonHybridCar extends VehicleTypes{
	
	@Override
	protected void createVehicleType() {
		cars.add(new MitsubishiMirage());
	}
	


}
