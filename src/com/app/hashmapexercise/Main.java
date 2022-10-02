package com.app.hashmapexercise;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> agesOfPeople = new HashMap<>(); //Initiation of Creation HashMap
        agesOfPeople.put("George ", 18); //Element 1 of HashMap
        agesOfPeople.put("Paul ", 22); //Element 2 of HashMap
        agesOfPeople.put("John ", 45); //Element 3 of HashMap
        agesOfPeople.put("Mike ", 50); //Element 4 of HashMap
        agesOfPeople.put("Orestis ", 20);//Element 5 of HashMap
        for (String ageCounter : agesOfPeople.keySet()) { //Retrieving the keys which are the names of people declared
            System.out.println(ageCounter);
        }
        for (int ageCounter : agesOfPeople.values()) { //Retrieving the values which are the ages of people declared
            System.out.println(ageCounter);
        }
        Integer ageIndicator = agesOfPeople.get(3); //Retrieving the Age of Mike which is a Key to the age of Mike which is the value
        System.out.println("The ages of people declared are: " + ageIndicator);
        Integer removeAgeIndicator = agesOfPeople.remove("George"); //Removing the Age of George which is a Key to the age of George which is the value
        System.out.println("The ages of people declared with the removal of the key George are: " + removeAgeIndicator);
    }
}

