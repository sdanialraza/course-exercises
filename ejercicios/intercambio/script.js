let a = prompt("Ingrese un valor para a")
let b = prompt("Ingrese un valor para b")

const temp = a
a = b
b = temp

document.querySelector("#a").innerHTML = `El valor de a es: ${a}`
document.querySelector("#b").innerHTML = `El valor de a es: ${b}`
