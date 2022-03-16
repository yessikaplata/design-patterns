package com.review.design_patterns.Builder.builder;

import com.review.design_patterns.Builder.components.Engine;
import com.review.design_patterns.Builder.components.GPSNavigator;
import com.review.design_patterns.Builder.components.Transmission;
import com.review.design_patterns.Builder.components.TripComputer;
import com.review.design_patterns.Builder.model.CarType;

public interface Builder {
	void setCarType(CarType type);

	void setSeats(int seats);

	void setEngine(Engine engine);

	void setTransmission(Transmission transmission);

	void setTripComputer(TripComputer tripComputer);

	void setGPSNavigator(GPSNavigator gpsNavigator);
}
