package com.animal.kingdom;

import java.util.ArrayList;

public class Mammal extends Kingdom{
    private final int noOfBackbone;
    private final boolean hasTail;
    private final int lengthOfTail;

    public Mammal(String name, int legs, String sound, String family, ArrayList<String> food, int noOfBackbone, boolean hasTail, int lengthOfTail, Habitat habitat, InternalAttributes internal){
        super(name, legs, sound, family, food, habitat, internal);
        this.noOfBackbone = noOfBackbone;
        this.hasTail = hasTail;
        this.lengthOfTail = lengthOfTail;
    }
    public void backBone(){
        System.out.println("I have " + noOfBackbone + " backbones.");
    }
    public void lengthOfTail(){
        if (hasTail){
            System.out.println("My tail is " + lengthOfTail + " inches.");
        }else{
            System.out.println("I don't have a tail.");
        }
    }
}
