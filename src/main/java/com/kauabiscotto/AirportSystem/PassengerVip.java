package com.kauabiscotto.AirportSystem;

public class PassengerVip extends Passenger{

    private int miles;

    public PassengerVip(String name, String passport, double baggageWeight, String typePassenger) {
        super(name, passport, baggageWeight, typePassenger);
        this.miles = 0;
    }

    public void accumulateMiles(int value) {
        this.miles += value;
    }
    public boolean redeemMiles(int value) {
        if (this.miles >= value) {
            this.miles -= value;
            return true;
        }
        return false;
    }

    @Override
    public double fareCalculation() {
        double price = 150.00;
        if (miles >= 1000.00) {
            price -= 50.00;
        }
        return price;
    }

    public int getMiles() {
        return miles;
    }
}
