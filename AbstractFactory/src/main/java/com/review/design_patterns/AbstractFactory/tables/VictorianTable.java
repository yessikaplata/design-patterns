package com.review.design_patterns.AbstractFactory.tables;

public class VictorianTable implements ITable{

	@Override
	public void getTable() {

		System.out.println("You have created a Victorian Table");
	}

}
