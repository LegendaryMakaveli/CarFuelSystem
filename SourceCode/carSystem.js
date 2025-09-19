let keySwitch = false;

let carFuel = 50;

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

module.exports = {ignition, powerSwith, carTankCapacity};