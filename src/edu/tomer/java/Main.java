package edu.tomer.java;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        MyTimerTask t = new MyTimerTask();

        class MyClass{
            public MyClass() {
                t.run();
            }
        }

        Drivable d = new Drivable() {
            @Override
            public void drive() {

            }

            @Override
            public void turn(double degrees) {

            }
        };

        MyClass c = new MyClass();


        House h = new House("Hashalom 10", 3);
        System.out.println(h);

        House.Room r = h.new Room(10, 10);
    }

    //disposable class for inner use only
    private static class MyTimerTask extends TimerTask{

        @Override
        public void run() {
            System.out.println("Run MyTimerTask");
        }
    }
}
