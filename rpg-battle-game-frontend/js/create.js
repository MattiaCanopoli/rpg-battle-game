'use strict'
import {
    rollChar,
} from "./common.js"


const btn = document.getElementById("testBtn")


let charRolls = []

btn.addEventListener("click", function () {
    charRolls = [];
    for (let i = 0; i < 6; i++) {
        charRolls.push(rollChar())
    }
    console.log(charRolls)
})

