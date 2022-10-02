package com.app.arraylistexercise;

public class Motorcycle {
    private int motorcycleID;
    private String motorcycleName;
    private String motorcycleSpeed;

    public Motorcycle(int motorcycleID, String motorcycleName, String motorcycleSpeed) {
        this.motorcycleID = motorcycleID;
        this.motorcycleName = motorcycleName;
        this.motorcycleSpeed = motorcycleSpeed;
    }

    public Motorcycle() {
    }

    public int getMotorcycleID() {
        return motorcycleID;
    }

    public void setMotorcycleID(int motorcycleID) {
        this.motorcycleID = motorcycleID;
    }

    public String getMotorcycleName() {
        return motorcycleName;
    }

    public void setMotorcycleName(String motorcycleName) {
        this.motorcycleName = motorcycleName;
    }

    public String getMotorcycleSpeed() {
        return motorcycleSpeed;
    }

    public void setMotorcycleSpeed(String motorcycleSpeed) {
        this.motorcycleSpeed = motorcycleSpeed;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "motorcycleID=" + motorcycleID +
                ", motorcycleName='" + motorcycleName + '\'' +
                ", motorcycleSpeed=" + motorcycleSpeed +
                '}';
    }
}
