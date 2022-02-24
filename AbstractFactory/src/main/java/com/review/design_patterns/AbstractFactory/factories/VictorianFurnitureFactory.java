package com.review.design_patterns.AbstractFactory.factories;

import com.review.design_patterns.AbstractFactory.chairs.IChair;
import com.review.design_patterns.AbstractFactory.chairs.VictorianChair;
import com.review.design_patterns.AbstractFactory.tables.ITable;
import com.review.design_patterns.AbstractFactory.tables.VictorianTable;

public class VictorianFurnitureFactory implements IFurnitureFactory {

	@Override
	public IChair createChair() {
		return new VictorianChair();
	}

	@Override
	public ITable creatTable() {
		return new VictorianTable();
	}

}
