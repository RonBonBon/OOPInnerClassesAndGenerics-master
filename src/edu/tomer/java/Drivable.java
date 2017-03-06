package edu.tomer.java;

/**
 * Created by hackeru on 06/03/2017.
 */
public interface Drivable{
    //TODO: Constants public static final
    String TAG = "Drivable";

    //public abstract
    void drive();

    void turn(double degrees);

    default void log(String message) {
        System.out.println(TAG + " " + message);
    }
}
