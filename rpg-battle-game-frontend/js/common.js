'use strict'

export function rollD20(times) {
    let rolls = [];
    for (let i = 0; i < times; i++) {
        let roll = Math.ceil(Math.random() * 20)
        rolls.push(roll)
    }
    return rolls
}

export function rollChar() {
    let rolls = [];
    //add 4 rolls to rolls array
    for (let i = 0; i < 4; i++) {
        rolls.push(Math.ceil(Math.random() * 7))
    }
    //find min roll
    let minRoll = Math.min.apply(null, rolls);
    //remove min roll from array
    rolls.splice(rolls.indexOf(minRoll), 1);
    //sums all the values
    let sum = 0;
    for (let i = 0; i < rolls.length; i++) {
        sum += rolls[i];
    }
    return sum;
}