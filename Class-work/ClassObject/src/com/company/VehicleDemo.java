package com.company;
class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
}
// This class declares an object of type vehicle
public class VehicleDemo {

    public static void main(String[] args) {
	// write your code here
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg =21;
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + " passengers  with range of " + range );
    }
}
