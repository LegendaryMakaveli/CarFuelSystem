let keySwitch = false;
let carFuel = 50;
let gear = 'P';

function ignition(){
    return keySwitch
}

function powerSwith() {
    if(keySwitch == false) {
        keySwith = true;
    }else {
        keySwith = false;
    }
}

function carTankCapacity(){
    if(carFuel == 0) {
        keySwitch = false
    } else 
    return carFuel
}

function driveCar(driveGear){
    if(keySwitch == true && driveGear == 'D'){
        gear = driveGear;
    }
    return gear;
}


module.exports = {ignition, powerSwith, carTankCapacity, driveCar};