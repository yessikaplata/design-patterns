package com.review.design_patterns.Builder.builder;

import com.review.design_patterns.Builder.components.Engine;
import com.review.design_patterns.Builder.components.GPSNavigator;
import com.review.design_patterns.Builder.components.Transmission;
import com.review.design_patterns.Builder.components.TripComputer;
import com.review.design_patterns.Builder.model.CarType;
import com.review.design_patterns.Builder.model.Manual;

public class ManualBuilder implements Builder {
	private CarType type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;

	@Override
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

	public Manual getResult() {
		return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}
}
