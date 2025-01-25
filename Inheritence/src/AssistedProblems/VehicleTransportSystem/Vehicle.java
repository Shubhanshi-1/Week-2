package AssistedProblems.VehicleTransportSystem;

import java.util.ArrayList;
class Vehicle{
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed= maxSpeed;
        this.fuelType=fuelType;
    }

    void displayInfo(){
        System.out.println("Maximum Speed: "+maxSpeed);
        System.out.println("Fuel type: "+fuelType);
    }
}

