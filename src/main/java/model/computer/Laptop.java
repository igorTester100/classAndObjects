package model.computer;

public class Laptop extends Computer {

    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    public int volumeUp() {
        return volumeLevel += 5;
    }

    public int volumeDown() {
        volumeLevel -= 2;
        if(volumeLevel <=0) {
            return 0;
        } else {
            return volumeLevel;
        }

    }

    public void switchOn() {
        System.out.println("Checking battery level");
        if(batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level to low!");
        }
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }

}
