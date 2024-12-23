'use strict'

export function rollDice(times, value) {
    let rolls = [];
    for (let i = 0; i < times; i++) {
        let roll = Math.ceil(Math.random() * value)
        rolls.push(roll)
    }

    let sum = 0;
    for (let i = 0; i < rolls.length; i++) {
        sum += rolls[i];
    }
    return sum
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

export function logToTextarea(textarea, message) {
    textarea.value += message + "\n";
    textarea.scrollTop = textarea.scrollHeight
}
