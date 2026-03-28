package com.kauabiscotto.AirportSystem;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    private int flightNumber;
    private String origin;
    private String destination;
    private Aircraft aircraft;
    private List<Passenger> passengers;


    public Flight(int flightNumber, String origin, String destination, Aircraft aircraft) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.aircraft = aircraft;
        this.passengers = new ArrayList<>();
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void addPassenger(Passenger p) {
        double newTotalWeight = calculateTotalWeight() + p.getBaggageWeight();
        if (aircraft.checkCapacity(passengers.size() + 1) && aircraft.checkWeight(newTotalWeight)) {
            passengers.add(p);
        } else {
            System.out.println("Cannot add passenger: capacity or weight exceeded!");
        }
    }

    public double calculateTotalRevenue() {
        double total = 0;
        for (Passenger p : passengers) {
            total += p.fareCalculation();
        }
        return total;
    }

    public double calculateTotalWeight() {
        double total = 0;
        for (Passenger p : passengers) {
            total += p.getBaggageWeight();
        }
        return total;
    }

    public void displayInfo() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        aircraft.displayInfo();
        System.out.println("Passengers on board: " + passengers.size());
    }

}
