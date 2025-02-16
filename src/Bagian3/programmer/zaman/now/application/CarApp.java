package Bagian3.programmer.zaman.now.application;

import Bagian3.programmer.zaman.now.data.Avanza;
import Bagian3.programmer.zaman.now.data.Car;

public class CarApp {

    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
        System.out.println(car.getBrand());
    }
}
