const {ignition, powerSwitch, carTankCapacity, driveCar, setCarFuel} = require("../SourceCode/carSystem");

describe("Test that my car can be turned on", () => {
    test("test that the ignition is off by default", () => {
        expect(ignition()).toBe(false);
    });

    test("test that my car can be turn on", () => {
        expect(ignition()).toBe(false);
        powerSwitch();
        expect(ignition()).toBe(true);
        powerSwitch();
    });

    test("test that my car can be turned off", () => {
        powerSwitch();
        powerSwitch();
        expect(ignition()).toBe(false);
    });
});

describe("Test my car tank and its capacity", () => {
    test("test that my car tank is not empty", () => {
        expect(carTankCapacity()).toBe(50);
    });

    test("test thst my car dont start if the fuel is empty", () => {
        setCarFuel(0);
        powerSwitch();
        expect(ignition()).toBe(false);
        powerSwitch();
        setCarFuel(50);
    });
});

describe("Test that my car default is park and can change", () => {
    test("test that my car default gear is in PARK", () => {
        expect(driveCar("P")).toBe("P")
    })

    test("test that the gear can be change to Drive", () => {
        powerSwitch();
        expect(driveCar("D")).toBe("D");
        powerSwitch();
    })

});