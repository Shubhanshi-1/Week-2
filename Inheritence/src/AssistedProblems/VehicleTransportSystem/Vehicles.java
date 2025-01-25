package AssistedProblems.VehicleTransportSystem;


import java.util.ArrayList;
class Vehicles{
    int maxSpeed;
    String fuelType;

    Vehicles(int maxSpeed,String fuelType){
        this.maxSpeed= maxSpeed;
        this.fuelType=fuelType;
    }

    void displayInfo(){
        System.out.println("Maximum Speed: "+maxSpeed);
        System.out.println("Fuel type: "+fuelType);
    }
}

class Cars extends Vehicles{

    int seatCapacity;

    Cars(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity= seatCapacity;
    }

    void displayInfo(){
        System.out.println("Vehicle Type: Car");
        super.displayInfo();
        System.out.println("Seat capacity is: "+seatCapacity);
    }
}
class Trucks extends Vehicles{
    int totalWheels;

    Trucks(int maxSpeed,String fuelType, int totalWheels){
        super(maxSpeed,fuelType);
        this.totalWheels=totalWheels;
    }

    void displayInfo(){
        System.out.println("Vehicle type: Truck");
        super.displayInfo();
        System.out.println("Total number of wheels: "+totalWheels);
    }
}
class MotorCycles extends Vehicles{
    double mileage ;

    MotorCycles(int maxSpeed,String fuelType, double mileage){
        super(maxSpeed,fuelType);
        this.mileage=mileage;
    }

    void displayInfo(){
        System.out.println("Vehicle Type: MotoCycle");
        super.displayInfo();
        System.out.println("Mileage: "+mileage);
    }
}
class Vehicles1{
    public static void main(String args[]){
        Car car = new Car(280,"Petrol",6);
        Truck truck = new Truck(120,"diesel",12);
        MotorCycle motorcycle = new MotorCycle(200,"petrol",80);

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(motorcycle);

        for(Vehicle vehicle: vehicles){
            vehicle.displayInfo();
        }

    }
}



