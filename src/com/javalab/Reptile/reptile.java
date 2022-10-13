package com.javalab.Reptile;

import com.javalab.Animal.Animal;

public class reptile extends Animal {

    private String skinType;
    private String bone;
    private String eggType;

    public reptile(){
    }

    
    public reptile(String skinType, String bone, String eggType){
        this.skinType = skinType;
        this.bone = bone;
        this.eggType = eggType;
    }



    public reptile(int height, int weight, String animalType, String bloodType, String skinType, String bone, String eggType){
        super(height, weight, animalType, bloodType);
        this.skinType = skinType;
        this.bone = bone;
        this.eggType = eggType;
    }


    public String getSkinType() {
        return this.skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getBone() {
        return this.bone;
    }

    public void setBone(String bone) {
        this.bone = bone;
    }

    public String getEggType() {
        return this.eggType;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }




}
