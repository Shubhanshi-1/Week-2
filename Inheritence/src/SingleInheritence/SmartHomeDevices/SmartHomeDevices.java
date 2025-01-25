package SingleInheritence.SmartHomeDevices;

class SmartHomeDevices{
    public static void main(String args[]){
        Thermostat thermostat = new Thermostat("TH113","ON",120.50);
        thermostat.displayStatus();
    }
}


