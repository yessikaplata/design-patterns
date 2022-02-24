package com.review.design_patterns.AbstractFactory.factories;

import com.review.design_patterns.AbstractFactory.chairs.IChair;
import com.review.design_patterns.AbstractFactory.chairs.ModernChair;
import com.review.design_patterns.AbstractFactory.tables.ITable;
import com.review.design_patterns.AbstractFactory.tables.ModernTable;

public class ModernFurnitureFactory implements IFurnitureFactory {

	@Override
	public IChair createChair() {
		return new ModernChair();
	}

	@Override
	public ITable creatTable() {
		return new ModernTable();
	}

}
