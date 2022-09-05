package model.computer;

public class PC extends Computer{

    private boolean isPowerSupply;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        isPowerSupply = false;
    }

    public void setPowerSupply(boolean powerSupply) {
        isPowerSupply = powerSupply;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    public int volumeUp() {
        return volumeLevel += 1;
    }

    public int volumeDown() {
        volumeLevel-=1;
        if(volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }

    }


    @Override
    public void switchOn() {
        System.out.println("Checking power supply.");
        if(isPowerSupply == true) {
            super.switchOn();
        } else {
            System.out.println("Power supply missing!");
        }
    }
}
