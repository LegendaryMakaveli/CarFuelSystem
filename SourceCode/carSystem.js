let keySwitch = false;
let carFuel = 50;
let gear = "P";

function setCarFuel(amount) {
    carFuel = amount;
}
function ignition(){
    return keySwitch
}

function powerSwitch() {
    if (carFuel === 0) {
        keySwitch = false;
        return;
    }
    if (keySwitch === false) {
        keySwitch = true;
    } else {
        keySwitch = false;
    }
}

function carTankCapacity(){
    if(carFuel == 0) {
        keySwitch = false
    } else 
    return carFuel
}

function driveCar(driveGear){
    if(keySwitch == true && driveGear == "D"){
        gear = driveGear;
    }
    return gear;
}

module.exports = {ignition, powerSwitch, carTankCapacity, driveCar, setCarFuel};