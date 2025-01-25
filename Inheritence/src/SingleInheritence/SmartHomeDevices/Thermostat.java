package SingleInheritence.SmartHomeDevices;

class Thermostat extends Devices{

    double tempratureSetting;

    Thermostat(String deviceId, String status,double tempratureSetting){
        super(deviceId,status);
        this.tempratureSetting= tempratureSetting ;
    }

    void displayStatus(){
        System.out.println("Device type: Thermostat");
        System.out.println("Device ID: "+deviceId);
        System.out.println("Device Status: "+status);
        System.out.println("Device temperature: "+tempratureSetting);
    }
}
