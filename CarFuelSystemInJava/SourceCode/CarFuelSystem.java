public class CarFuelSystem {
    private String name;
    private int model;
    private int tankCapacity;
    private String color;
    private String type;
    private boolean ignition = false;
    private char gear = 'P';
    int accelerate;
    double fuelEff;

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setModel(int newModel) {
        model = newModel;
    }

    public int getModel() {
        return model;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public String getColor() {
        return color;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public String getType() {
        return type;
    }

    public void setIgnition() {
        ignition = false;
    }

    public boolean getIgnition() {
        return ignition;
    }

    public void powerBotton() {
        ignition = !ignition;
    }

    public void setTankCapacity(int amount) {
        if (amount > 50) {
            throw new IllegalArgumentException("Tank Capacity Exceeded");
        } else {
            tankCapacity = amount;
        }
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void refillCar(int refill) {
        if (tankCapacity < 50) {
            tankCapacity += refill;
        } else {
            throw new IllegalArgumentException("Tank cannot be refill");
        }
    }

    public void setGear() {
        gear = 'P';
    }

    public char getGear() {
        return gear;
    }

    public void setGearLevel(char putToGear) {
        if(putToGear != 'D') {
            throw new IllegalArgumentException("Gear Level Doesn't Match");
        }
        if(ignition && gear == 'P') {
            gear = putToGear;
        }else{
            throw new IllegalArgumentException("Cannot change gear");
        }
    }

    public char getGearLevel() {
        return gear;
    }


    public void setDistance(int accelerator) {
        for(int count = 1; count <= 50; count++) {
            if (ignition && tankCapacity == 50 && gear == 'D' && accelerator == 1) {
                accelerate++;
            }
        }
    }

    public int getDistance() {
        return accelerate;
    }

    public void setRemainingFuel(int fulledUsed) {
        if (ignition && tankCapacity == 50 && gear == 'D' && accelerate == 50) {
            tankCapacity -= fulledUsed;
        }
    }

    public int getRemainingFuel() {
        return tankCapacity;
    }

    public void setFuelEfficiency(double distance) {
        if(ignition && gear == 'D' && accelerate == 50 && tankCapacity == 50) {
            fuelEff = distance / accelerate;
        }
    }

    public double getFuelEfficiency() {
        return fuelEff;
    }
}

