import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TestCarFuelSystem {

    @Test
    public void TestThatCreateMyCarObject(){
        String name = "Makaveli";
        int model = 2025;
        String color = "Red";
        String type = "concept car";

        CarFuelSystem myCar = new CarFuelSystem();
        myCar.setName(name);
        myCar.setModel(model);
        myCar.setColor(color);
        myCar.setType(type);

       assertEquals("Makaveli", myCar.getName());
       assertEquals(2025, myCar.getModel());
       assertEquals("Red", myCar.getColor());
       assertEquals("concept car", myCar.getType());

    }

    @Test
    public void TestThatMyCarObjectIsOffByDefault(){
        CarFuelSystem myCar = new CarFuelSystem();
        myCar.setIgnition();

        assertFalse(myCar.getIgnition());
    }

    @Test
    public void TestMyCarTankCapacity(){
        CarFuelSystem myCar = new CarFuelSystem();
        myCar.setTankCapacity(50);

        assertEquals(50,myCar.getTankCapacity());
    }

    @Test
    public void TestMyCarTankThrowExceptionIfExceedLimit(){
        CarFuelSystem myCar = new CarFuelSystem();
        myCar.setTankCapacity(50);

        assertThrows(IllegalArgumentException.class, () -> myCar.setTankCapacity(60));
    }

    @Test
    public void TestMyCarTankCanBeFilledIfiTLow(){
        CarFuelSystem myCar = new CarFuelSystem();
        myCar.setTankCapacity(30);
        myCar.refillCar(20);

        assertEquals(50, myCar.getTankCapacity());
    }

    @Test
    public void TestThatMyCarCanBeTurnedOn(){
        CarFuelSystem myCar = new CarFuelSystem();
        myCar.powerBotton();
        assertTrue(myCar.getIgnition());
    }

    @Test
    public void TestThatMyCarCanBeTurnedOff(){
        CarFuelSystem myCar = new CarFuelSystem();
        myCar.powerBotton();
        myCar.powerBotton();

        assertFalse(myCar.getIgnition());
    }

    @Test
    public void TestMyCarDefaultGearToBePark(){
        CarFuelSystem myCar = new CarFuelSystem();
        myCar.setGear();

        assertEquals('P', myCar.getGear());
    }

    @Test
    public void TestThatMyCarCanBePutInGearToDrive() {
        CarFuelSystem myCar = new CarFuelSystem();
        myCar.powerBotton();
        myCar.setGear();
        myCar.setGearLevel('D');

        assertEquals('D', myCar.getGearLevel());
    }

    @Test
    public void TestMyCarGearValidity(){
        CarFuelSystem myCar = new CarFuelSystem();
        myCar.powerBotton();
        myCar.setGear();
        myCar.setGearLevel('D');

        assertThrows(IllegalArgumentException.class, () -> myCar.setGearLevel('G'));
    }

    @Test
    public void TestThwDistanceMyCarCanReach(){
        CarFuelSystem myCar = new CarFuelSystem();
        myCar.powerBotton();
        myCar.setTankCapacity(50);
        myCar.setGearLevel('D');
        myCar.setDistance(1);

        assertEquals(50, myCar.getDistance());
    }

    @Test
    public void TestMyCarFuelUsage(){
        CarFuelSystem myCar = new CarFuelSystem();
        myCar.powerBotton();
        myCar.setTankCapacity(50);
        myCar.setGearLevel('D');
        myCar.setDistance(1);
        myCar.setRemainingFuel(10);

        assertEquals(40, myCar.getRemainingFuel());
    }

    @Test
    public void TestMyCarFuelEfficiency(){
        CarFuelSystem myCar = new CarFuelSystem();
        myCar.powerBotton();
        myCar.setTankCapacity(50);
        myCar.setGearLevel('D');
        myCar.setDistance(1);
        myCar.setRemainingFuel(10);
        myCar.setFuelEfficiency(10);

        assertEquals(0.2, myCar.getFuelEfficiency());
    }
}
