package com.animal.kingdom;

import java.util.ArrayList;

public class Insect extends Kingdom{
    private final boolean canFly;

    public Insect(String name, int legs, String sound, String family, boolean canFly, ArrayList<String> food, Habitat habitat, InternalAttributes internal){
        super(name,legs, sound, family, food, habitat, internal);
        this.canFly = canFly;
    }

    @Override
    public void canWalk(){
        if(canFly){
            super.canWalk();
            System.out.println("I can also fly");
        }else{
            super.canWalk();
        }
    }
}
