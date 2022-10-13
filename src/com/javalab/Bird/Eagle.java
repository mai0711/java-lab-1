package com.javalab.Bird;

public class Eagle extends birds {


    public Eagle(){
    }

    public Eagle(int height, int weight, String animalType, String bloodType, String feathers, boolean canFly){
        super(height, weight, animalType, bloodType, feathers, canFly);
    }


    public String showInfo() {
        return "Eagle [weight: " + super.getWeight() + ", height: " + super.getHeight() + ", animalType: " + super.getAnimalType() + ", bloodType: " + super.getBloodType() + ", feathers: " + super.getFeathers() + "]";
    
    }

}
