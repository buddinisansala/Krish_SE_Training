package com.buddhi.designpattern.factorymethod;

public class ElectricCar extends VehicleTypes {
	
	@Override
	protected void createVehicleType() {

		cars.add(new NissanLeaf());
	}
	


}
