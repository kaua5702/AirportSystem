package com.kauabiscotto.AirportSystem;

public class Passenger {

    private String name;
    private String  passport;
    private double baggageWeight;
    private String typePassenger;


    public Passenger(String name, String passport, double baggageWeight, String typePassenger) {
        this.name = name;
        this.passport = passport;
        this.baggageWeight =baggageWeight;
        this.typePassenger = typePassenger;
    }

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    public double getBaggageWeight() {
        return baggageWeight;
    }

    public String getTypePassenger() {
        return typePassenger;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public void setBaggageWeight(double baggageWeight) {
        this.baggageWeight = baggageWeight;
    }

    public void setTypePassenger(String passenger) {
        this.typePassenger = typePassenger;
    }


    public double fareCalculation() {
        double price = 200.00;
        return price;
    }
}
