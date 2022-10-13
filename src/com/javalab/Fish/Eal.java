package com.javalab.Fish;

public class Eal extends fish {
    private String isReleaseElectricCharge;

    public Eal(){ 
    }

     public Eal(String isReleaseElectricCharge){
        this.isReleaseElectricCharge = isReleaseElectricCharge;
     }

     public Eal(int height, int weight, String animalType, String bloodType, boolean isLiveinwater, String gills, String isReleaseElectricCharge){
        super(height, weight, animalType, bloodType, isLiveinwater, gills);
        this.isReleaseElectricCharge = isReleaseElectricCharge;
    }

     public String getIsReleaseElectricCharge() {
         return this.isReleaseElectricCharge;
     }

     public void setIsReleaseElectricCharge(String isReleaseElectricCharge) {
         this.isReleaseElectricCharge = isReleaseElectricCharge;
     }


    public String showInfo() {
        return "Eel [weight: " + super.getWeight() + ", height: " + super.getHeight() + ", animalType: " + super.getAnimalType() + ", bloodType: " + super.getBloodType() + ", gills: " + super.getGills() + ", isReleaseElectricCharge: " + isReleaseElectricCharge + "]";
    }
     

}
