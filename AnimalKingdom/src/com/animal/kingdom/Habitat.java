package com.animal.kingdom;

public class Habitat {
    private final String niche;

    public Habitat(String niche){
        this.niche = niche;
    }
    protected String printNiche(){
        return niche;
    }
}
