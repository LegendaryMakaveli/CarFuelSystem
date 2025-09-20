const {ignition, powerSwith, carTankCapacity, driveCar} = require("../SourceCode/carSystem");

describe("Test that my car can be turned on", () => {
    test("test that the ignition is off by default", () => {
        expect(ignition()).toBe(false);
    });

    test("test that my car can be turn on", () => {
        expect(ignition()).toBe(false);
        powerSwith();
        expect(ignition()).toBe(false);
        powerSwith();
    });

    test("test that my car can be turned off", () => {
        powerSwith();
        powerSwith();
        expect(ignition()).toBe(false);
    });
});

describe("Test my car tank and its capacity", () => {
    test("test that my car tank is not empty", () => {
        expect(carTankCapacity()).toBe(50);
    });

    test("test thst my car dont start if the fuel is empty", () => {
        let carFuel = 0
        powerSwith()
        expect(ignition()).toBe (false)
    });
});

describe("Test that my car default is park and can change", () => {
    test("test that my car default gear is in PARK", () => {
        powerSwith
    })

});