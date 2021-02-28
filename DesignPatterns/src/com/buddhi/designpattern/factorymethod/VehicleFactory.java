package com.buddhi.designpattern.factorymethod;

public class VehicleFactory {
	
	public static VehicleTypes createVehicleType(VehicleCode vehicleCode ) {
		
		switch (vehicleCode) {
			case Hybrid:
			return new HybridCar();
			case NonHybrid:
			return new NonHybridCar();
			case Electric:
			return new ElectricCar();

		default:
			return null;
		}
	}

}
