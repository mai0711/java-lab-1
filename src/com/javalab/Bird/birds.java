package com.javalab.Bird;

import com.javalab.Animal.Animal;

public class birds extends Animal {
   private String feathers;
   private boolean canFly;

public birds(){
    super();
    this.feathers = "unknown";
    this.canFly = false;
}

public birds(int height, int weight, String animalType, String bloodType, String feathers, boolean canFly){
    super(height, weight, animalType, bloodType);
    this.feathers = feathers;
    this.canFly = canFly;

}


public String getFeathers() {
    return this.feathers;
}

public void setFeathers(String feathers) {
    this.feathers = feathers;
}

public boolean isCanFly() {
    return this.canFly;
}

public void setCanFly(boolean canFly) {
    this.canFly = canFly;
}

}
