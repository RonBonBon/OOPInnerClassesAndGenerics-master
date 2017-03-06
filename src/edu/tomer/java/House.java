package edu.tomer.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hackeru on 06/03/2017.
 */

//outer class:
public class House {
    private String address;
    private List<Room> rooms = new ArrayList<>();


    public House(String address, int numRooms) {
        this.address = address;
        for (int i = 0; i < numRooms; i++) {
            rooms.add(new Room(5, 5));
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", rooms=" + rooms +
                '}';
    }

    //inner class
    public class Room {
        //hidden reference to House
        private double width;
        private double height;

        public Room(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public String toString() {
            return "\nRoom{" +
                    "width=" + width +
                    ", height=" + height +
                    "address: " + address +
                    '}';
        }
    }

}
