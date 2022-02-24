package com.review.design_patterns.AbstractFactory.factories;

import com.review.design_patterns.AbstractFactory.chairs.IChair;
import com.review.design_patterns.AbstractFactory.tables.ITable;

public interface IFurnitureFactory {
	IChair createChair();
	ITable creatTable();
}
