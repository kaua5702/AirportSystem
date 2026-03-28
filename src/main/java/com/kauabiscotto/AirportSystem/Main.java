package com.kauabiscotto.AirportSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Aircraft input
        System.out.println("=== Aircraft Registration ===");
        System.out.print("Model: ");
        String model = sc.nextLine();
        System.out.print("Maximum passenger capacity: ");
        int capacity = sc.nextInt();
        System.out.print("Maximum supported weight (kg): ");
        int maxWeight = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.print("Aircraft record: ");
        String record = sc.nextLine();

        Aircraft aircraft = new Aircraft(model, capacity, maxWeight, record);

        // Flight input
        System.out.println("\n=== Flight Registration ===");
        System.out.print("Flight number: ");
        int flightNumber = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.print("Origin: ");
        String origin = sc.nextLine();
        System.out.print("Destination: ");
        String destination = sc.nextLine();

        Flight flight = new Flight(flightNumber, origin, destination, aircraft);

        // Passenger input
        System.out.println("\n=== Passenger Registration ===");
        System.out.print("How many passengers do you want to add? ");
        int qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.println("\nPassenger " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Passport: ");
            String passport = sc.nextLine();
            System.out.print("Baggage weight (kg): ");
            double baggageWeight = sc.nextDouble();
            sc.nextLine();
            System.out.print("Type (VIP/Child/Senior/Normal): ");
            String type = sc.nextLine();

            Passenger p;
            if (type.equalsIgnoreCase("VIP")) {
                p = new PassengerVip(name, passport, baggageWeight, type);
            } else if (type.equalsIgnoreCase("Child")) {
                System.out.print("Child age: ");
                int age = sc.nextInt();
                sc.nextLine();
                p = new PassengerChild(name, passport, baggageWeight, type, age);
            } else if (type.equalsIgnoreCase("Senior")) {
                System.out.print("Passenger age: ");
                int age = sc.nextInt();
                sc.nextLine();
                p = new PassengerSenior(name, passport, baggageWeight, type, age);
            } else {
                p = new Passenger(name, passport, baggageWeight, type);
            }

            flight.addPassenger(p);
        }

        // Display final information
        System.out.println("\n=== Flight Information ===");
        flight.displayInfo();
        System.out.println("Total Revenue: $" + flight.calculateTotalRevenue());
        System.out.println("Total Baggage Weight: " + flight.calculateTotalWeight() + " kg");

        sc.close();
    }
}