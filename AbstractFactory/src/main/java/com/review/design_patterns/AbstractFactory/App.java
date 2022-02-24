package com.review.design_patterns.AbstractFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.review.design_patterns.AbstractFactory.factories.ModernFurnitureFactory;
import com.review.design_patterns.AbstractFactory.factories.VictorianFurnitureFactory;

/**
 * 
 * Abstract Factory pattern applied in a furniture factory.
 * 
 */
public class App {
	public static void main(String[] args) throws Exception {
		ApplicationFactory appFactory = configureApplicationFactory();
		appFactory.createFurniture();
	}

	private static ApplicationFactory configureApplicationFactory() throws Exception {

		ApplicationFactory appFactory = null;

		/* Read a type of furniture */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.format("\nEnter type of furniture 1:Modern Furniture, 2:Victorian Furniture \n");
		int typeFurniture = Integer.parseInt(reader.readLine());

		if (typeFurniture == 1) {
			appFactory = new ApplicationFactory(new ModernFurnitureFactory());
		} else if (typeFurniture == 2) {
			appFactory = new ApplicationFactory(new VictorianFurnitureFactory());
		} else {
			throw new Exception("Error! Unknown type of furniture.");
		}
		return appFactory;

	}
}
