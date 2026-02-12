package org.timmy;

import org.timmy.classexerciseoneandtwo.Bike;
import org.timmy.classexerciseoneandtwo.Child;
import org.timmy.classexerciseoneandtwo.Truck;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Child child = new Child();
        System.out.println(child.color);

        Bike bike = new Bike();
        bike.color = "Wine";
        bike.brand = "Boxer";
        Truck truck = new Truck();
        truck.color="White";
        truck.brand ="Volks";


        System.out.println("====BIKE OBJECT PRINT OUT=====");
        System.out.println(bike.color);
        System.out.println(bike.brand);
        bike.move();
        System.out.println("====BIKE OBJECT ENDS HERE PRINT OUT=====");

        System.out.println("====TRUCK OBJECT PRINT OUT=====");
        System.out.println(truck.color);
        System.out.println(truck.brand);
        truck.move();
        System.out.println("====TRUCK OBJECT PRINT OUT=====");
    }
}
