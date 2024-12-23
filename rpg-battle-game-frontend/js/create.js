'use strict'
import {
    rollChar,
} from "./common.js"


const btn = document.getElementById("testBtn")
const logArea = document.getElementById("log")

let charRolls = []

btn.addEventListener("click", function () {
    charRolls = [];
    for (let i = 0; i < 6; i++) {
        charRolls.push(rollChar())
    }
    logArea.value += "hai rollato " + charRolls + "\n"
    logArea.scrollTop = logArea.scrollHeight;
})



