package com.review.design_patterns.AbstractFactory;

import com.review.design_patterns.AbstractFactory.chairs.IChair;
import com.review.design_patterns.AbstractFactory.factories.IFurnitureFactory;
import com.review.design_patterns.AbstractFactory.tables.ITable;

public class ApplicationFactory {
	
	private IChair chair;
	private ITable table;
	
	public ApplicationFactory(IFurnitureFactory furnitureFactory) {
		chair = furnitureFactory.createChair();
		table = furnitureFactory.creatTable();
	}

	public void createFurniture() {
		chair.getChair();
		table.getTable();
	}
}
