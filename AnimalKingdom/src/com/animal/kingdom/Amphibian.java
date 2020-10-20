package com.animal.kingdom;

import java.util.ArrayList;

public class Amphibian extends Kingdom {
    public Amphibian(String name, int legs, String sound, String family, ArrayList<String>food, Habitat habitat, InternalAttributes internal){
        super(name, legs, sound, family, food, habitat, internal);
    }
    @Override
    public void canWalk(){
        System.out.println("I only Hop");
    }
}
