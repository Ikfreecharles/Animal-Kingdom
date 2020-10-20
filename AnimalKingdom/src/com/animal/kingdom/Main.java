package com.animal.kingdom;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> food = new ArrayList<>();
//        food.add("Bone");
//        food.add("Meat");
//        food.add("Milk");
//        food.add("Dog food");
//        Habitat niche = new Habitat("Land");
//        Mammal dog = new Mammal("Dog", 4, "Bark","Mammal", food, 26, true, 16, niche);
//
//        dog.aboutMe();
//        dog.canWalk();
//        dog.notHuman();
//        dog.backBone();
//        dog.lengthOfTail();

//        ArrayList<String> insectFood = new ArrayList<>();
//        insectFood.add("blood");
//
//        Insect mosquito = new Insect("Mosquito", 8, "Humm",false, insectFood );
//        mosquito.aboutMe();
//        mosquito.canWalk();
//        mosquito.notHuman();
//
//        ArrayList<String> antFood = new ArrayList<>();
//        antFood.add("leaf");
//        antFood.add("flesh");
//        antFood.add("dead matters");
//
//        Insect ant = new Insect("Ant", 8, "no sound", "Insect",false, antFood);
//        ant.aboutMe();
//        ant.notHuman();
//        ant.canWalk();

        ArrayList<String> frogFood = new ArrayList<>();
        frogFood.add("Insects");
        Habitat frogHouse = new Habitat("Water");

        Amphibian frog = new Amphibian("Frog", 4, "Croak", "Amphibian", frogFood, frogHouse);
        frog.aboutMe();
        frog.notHuman();
        frog.canWalk();
    }
}
