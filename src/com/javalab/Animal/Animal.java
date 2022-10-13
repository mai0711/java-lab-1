package com.javalab.Animal;

public class Animal {
    private int height;
    private int weight;
    private String animalType;
    private String bloodType;

    public Animal(){
        this.height = 0;
        this.weight = 0;
        this.animalType = "unknown";
        this.bloodType = "unknown";
    }

    public Animal(int height, int weight, String animalType, String bloodType){
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }


    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalType() {
        return this.animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBloodType() {
        return this.bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    

}
