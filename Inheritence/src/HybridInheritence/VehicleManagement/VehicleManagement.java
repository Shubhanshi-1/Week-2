package HybridInheritence.VehicleManagement;

//main class
class VehicleManagement{
    public static void main(String args[]){
        ElectricVehicle electric = new ElectricVehicle(250,"Gen-Z","Fully Charged");
        //Method call
        electric.charge();
        PetrolVehicle petrol= new PetrolVehicle(280,"Alpha",4);
        petrol.refuel();
        petrol.displayDetails();
    }
}

