package com.animal.kingdom;

public class InternalAttributes {
    private final String breathingMode;
    private final int noOfStomach;
    private final String bloodType;
    private final boolean hasTeeth;

    public InternalAttributes(String breathingMode, int noOfStomach, String bloodType, boolean hasTeeth){
        this.breathingMode = breathingMode;
        this.noOfStomach = noOfStomach;
        this.bloodType = bloodType;
        this.hasTeeth = hasTeeth;
    }
    protected String breathingMode(){
        return breathingMode;
    }
    protected int noOfStomach(){
        return noOfStomach;
    }
    protected String bloodType(){
        return bloodType;
    }
    protected boolean hasTeeth(){
        return hasTeeth;
    }
}
