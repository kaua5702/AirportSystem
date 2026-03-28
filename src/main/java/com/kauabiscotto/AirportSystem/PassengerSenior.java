package com.kauabiscotto.AirportSystem;

public class PassengerSenior extends Passenger{

    private int age;

    public PassengerSenior(String name, String passport, double baggageWeight, String typePassenger, int age) {
        super(name, passport, baggageWeight, typePassenger);
        this.age = age;
    }


    @Override
    public double fareCalculation() {
        double price = 200.00;
        if (age >= 60) {
            return price * 0.7;
        } else {
            return price;
        }
    }

    public int getAge() {
        return age;
    }
}
