package edu.tomer.java;

/**
 * Created by hackeru on 06/03/2017.
 */
public class Car implements Drivable{
    @Override
    public void drive() {
        System.out.println("Car Driving");
    }

    @Override
    public void turn(double degrees) {
        System.out.println("Turning by " + degrees + " degrees");
    }

}
