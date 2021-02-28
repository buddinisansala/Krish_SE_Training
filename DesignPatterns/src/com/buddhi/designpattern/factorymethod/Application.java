package com.buddhi.designpattern.factorymethod;

public class Application {

	public static void main(String[] args) {
		VehicleTypes vehicleType1 = VehicleFactory.createVehicleType(VehicleCode.Hybrid);
		System.out.println(vehicleType1);
		
		VehicleTypes vehicleType2 = VehicleFactory.createVehicleType(VehicleCode.Electric);
		System.out.println(vehicleType2);
	}
}
