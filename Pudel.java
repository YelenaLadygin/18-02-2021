package com.company;

public class Pudel extends Dog {

    protected String numberOfPonyTails;

    public Pudel(String name, String favoriteDogFood, String numberOfPonyTails) {
        super(name, favoriteDogFood);
        this.numberOfPonyTails = numberOfPonyTails;
    }
    @Override
    public void Bark(){
        super.Bark();
    }

    @Override
    public String toString() {
        return "Pudel{" +
                "numberOfPonyTails='" + numberOfPonyTails + '\'' +
                '}';
    }
}
