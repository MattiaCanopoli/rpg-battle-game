/*
TODO: usare tabella al posto di div e span -OK
creare una tabella ogni volta che si incontra un nuovo array
popolare la tabella inserendo i valori in vari td -OK
trovare un modo per ordinare la tabella*/

'use strict'

// FUNCTIONS

/*adds a row with two cells to a table*/
function createTableRows(cellOneText, cellTwoText, tableName) {
  const table = document.getElementById(tableName);
  const row = table.insertRow()
  row.classList.add("text-capitalize")
  const celllOne = row.insertCell(0);
  const cellTwo = row.insertCell(1);
  celllOne.innerText = cellOneText;
  cellTwo.innerText = cellTwoText;
}

/*fetch data from api and add datas to table */
async function getData(url, tableId) {
  const response = await fetch(url);
  const body = await response.json();
  console.log(body)
  for (let i = 0; i < body.length; i++) {
    body.forEach(function (element) {
      const keys = Object.getOwnPropertyNames(element);
      keys.forEach(function (key) {
        createTableRows(key, body[i][key], tableId)
      })
    })
  }
}

/*adds a CSS class to an HTML element.
CSS is removed after timeout time */
function addRemoveClass(elementId, cssAnimation, timeout) {
  const element = document.getElementById(elementId)
  element.classList.add(cssAnimation)
  setTimeout(function () {
    element.classList.remove(cssAnimation)
  }, timeout)
}

const url = "http://localhost:8080/api/"
const charKeys = ['race.name', 'characterClass.name', 'lifePoints', 'level', 'money']
const animationBtn = document.getElementById("btn")

getData(url + "creatures", "monster-table")
getData(url + "creatures", "player-table")

animationBtn.addEventListener("click", function () {
  addRemoveClass("character", 'move-left', 200)
})