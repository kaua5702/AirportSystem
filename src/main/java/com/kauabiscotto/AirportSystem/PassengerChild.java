package com.kauabiscotto.AirportSystem;

public class PassengerChild extends Passenger{

    private int age;

    public PassengerChild(String name, String passport, double baggageWeight, String typePassenger, int age) {
        super(name, passport, baggageWeight, typePassenger);
        this.age = age;
    }


    @Override
    public double fareCalculation() {
        double price = 200.00;
        if (age <= 12) {
            return price * 0.5;
        } else {
            return price;
        }
    }

    public int getAge() {
        return age;
    }
}
