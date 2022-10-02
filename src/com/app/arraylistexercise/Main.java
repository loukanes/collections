package com.app.arraylistexercise;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<String> motorcycles = new ArrayList<>(); // Create ArrayList
        motorcycles.add(0, "Honda"); //Element 1 of ArrayList
        motorcycles.add(1, "BMW"); //Element 2 of ArrayList
        motorcycles.add(2, "Yamaha"); //Element 3 of ArrayList
        motorcycles.add(3, "Kavasaki"); //Element 4 of ArrayList
        for (int motorcyclesCounter = 0; motorcyclesCounter < motorcycles.size(); motorcyclesCounter++) { //Initiation of reading ArrayList
            System.out.println("The number of motorcycles is: " + motorcycles.get(motorcyclesCounter));
        } //End of reading ArrayList
        System.out.println("The motorcycles are: " + motorcycles);
        motorcycles.set(3, "Ducati"); // Changing Element of ArrayList
        System.out.println("The motorcycles are: " + motorcycles);
        motorcycles.remove(2); //Removing Element of ArrayList
        System.out.println("The motorcycles are: " + motorcycles);
      //------------------------------------------------------------------------------NEW-----------------------------------------------
        ArrayList<Motorcycle> motorcycleArrayList = new ArrayList<>();
        Motorcycle motorcycleObject = new Motorcycle();
        String km = "km/h";
        double speed = 80.8;
        String speedinkmsph = Double.toString(speed) + km;
        motorcycleObject.setMotorcycleSpeed(speedinkmsph);
        motorcycleObject.setMotorcycleName("BMW");
        motorcycleObject.setMotorcycleID(0);
        motorcycleArrayList.add(motorcycleObject);
        System.out.println(motorcycleArrayList.get(0));
    }
}
