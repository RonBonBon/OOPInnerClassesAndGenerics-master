package edu.tomer.java;

import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        MyTimerTask t = new MyTimerTask();

        class MyClass{
            public MyClass() {
                t.run();
            }
        }

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
