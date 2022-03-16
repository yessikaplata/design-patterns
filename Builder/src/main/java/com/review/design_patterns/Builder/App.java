package com.review.design_patterns.Builder;

import com.review.design_patterns.Builder.builder.CarBuilder;
import com.review.design_patterns.Builder.builder.ManualBuilder;
import com.review.design_patterns.Builder.model.Car;
import com.review.design_patterns.Builder.model.Manual;

/**
 * Builder pattern applied in build cars and theirs manuals.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Director director = new Director();
        
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car carSport = carBuilder.getResult();
        System.out.println(carSport.getCarType());
        

        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manualSport = manualBuilder.getResult();
        System.out.println(manualSport.print());
    }
}
