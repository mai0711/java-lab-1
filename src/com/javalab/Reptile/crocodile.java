package com.javalab.Reptile;

public class crocodile extends reptile {
    private String hardShelledEggs;

    public crocodile(){
    }
    
    public crocodile(String hardShelledEggs){
        this.hardShelledEggs = hardShelledEggs;
    }

    public crocodile(int height, int weight, String animalType, String bloodType, String skinType, String bone, String eggType, String hardShelledEggs){
        super(height, weight, animalType, bloodType, skinType, bone, eggType);
        this.hardShelledEggs = hardShelledEggs;
        
    }

    public String getHardShelledEggs() {
        return this.hardShelledEggs;
    }

    public void setHardShelledEggs(String HardShelledEggs) {
        this.hardShelledEggs = HardShelledEggs;
    }

    public String showInfo() {
        return "Crocodile [weight: " + super.getWeight() + ", height: " + super.getHeight() + ", animalType: " + super.getAnimalType() + ", bloodType: " + super.getBloodType() + ", skinType: " + super.getSkinType() + ", backbone: " + super.getBone() + ", eggs: " + super.getEggType() + "]";
    }
    }

