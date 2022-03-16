package com.review.design_patterns.Builder.builder;

import com.review.design_patterns.Builder.components.Engine;
import com.review.design_patterns.Builder.components.GPSNavigator;
import com.review.design_patterns.Builder.components.Transmission;
import com.review.design_patterns.Builder.components.TripComputer;
import com.review.design_patterns.Builder.model.Car;
import com.review.design_patterns.Builder.model.CarType;

public class CarBuilder implements Builder {
	private CarType type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;

	public void setCarType(CarType type) {
		this.type = type;
	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	@Override
	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}

	public Car getResult() {
		return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}

}
