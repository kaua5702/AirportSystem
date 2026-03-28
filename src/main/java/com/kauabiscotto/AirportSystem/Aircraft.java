package com.kauabiscotto.AirportSystem;

public class Aircraft {

    private String model;
    private int capacity;
    private double maxWeight;
    private String record;


    public Aircraft(String model, int capacity, double maxWeight, String record) {
        this.model = model;
        this.capacity = capacity;
        this.maxWeight = maxWeight;
        this.record = record;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public String getRecord() {
        return record;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setRecord(String record) {
        this.record = record;
    }


    public boolean checkCapacity(int passengers) {
        if (passengers <= capacity) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkWeight(double weight) {
        if (weight <= maxWeight) {
            return true;
        } else {
            return false;
        }
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacity + " passengers");
        System.out.println("Maximum Weight: " + maxWeight + " kg");
        System.out.println("Record: " + record);
    }


}
