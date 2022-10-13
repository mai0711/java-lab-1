package com.javalab.Fish;

import com.javalab.Animal.Animal;

public class fish extends Animal{
    private boolean isLiveinwater;
    private String gills;

    public fish(){
    }

    public fish(boolean isLiveinwater, String gills){
        this.isLiveinwater = isLiveinwater;
        this.gills = gills;
    }
    
    public fish(int height, int weight, String animalType, String bloodType, boolean isLiveinwater, String gills){
        super(height, weight, animalType, bloodType);
        this.isLiveinwater = isLiveinwater;
        this.gills = gills;
    }


    public boolean isIsLiveinwater() {
        return this.isLiveinwater;
    }

    public void setIsLiveinwater(boolean isLiveinwater) {
        this.isLiveinwater = isLiveinwater;
    }

    public String getGills() {
        return this.gills;
    }

    public void setGills(String gills) {
        this.gills = gills;
    }

}