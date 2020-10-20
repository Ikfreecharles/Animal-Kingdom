package com.animal.kingdom;

import java.util.ArrayList;

public class Kingdom {
    private final String name;
    private final int noOfLegs;
    private final String soundMade;
    private final String family;
    private final ArrayList<String> food;
    private final Habitat habitat;
    private final InternalAttributes internal;


    protected Kingdom(String name, int noOfLegs, String soundMade, String family, ArrayList<String> food, Habitat habitat, InternalAttributes internal){
        this.name = name;
        this.noOfLegs = noOfLegs;
        this.soundMade = soundMade;
        this.family = family;
        this.food = food;
        this.habitat = habitat;
        this.internal = internal;
    }

    protected void canWalk(){
        System.out.println("I can only walk");
    }
    protected final void notHuman(){
        System.out.println("I know I am not a human!!!");
    }
    protected void aboutMe(){
        System.out.println("My name is " + name + ".");
        System.out.println("I have " + noOfLegs + " legs.");
        System.out.println("I " + soundMade);
        String animalFood = "";
        for(String foods: food){
            animalFood += foods + ", ";
        }
        System.out.println("I feed on " + animalFood);
        System.out.println("I belong to the family " + family);
        System.out.println("I live on " + habitat.printNiche());
        System.out.println("I breath through my " + internal.breathingMode());
        System.out.println("I have " + internal.noOfStomach() + " stomach");
        System.out.println("My type of blood is " + internal.bloodType());
        if(internal.hasTeeth()){
            System.out.println("I do have teeth for chewing");
        }else{
            System.out.println("I do not have teeth!!! :(");
        }
    }
}
