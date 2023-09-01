/**
 * Suma dos numeros
 *
 * @param {number} primerNumero - El primer numero a sumar
 * @param {number} segundoNumero - El segundo numero a sumar
 * @returns {number} El resultado de la suma de los dos numeros
 */
function sumar(primerNumero, segundoNumero) {
	return primerNumero + segundoNumero
}

/**
 * Resta los numeros
 *
 * @param {number} primerNumero - El primer numero a restar
 * @param {number} segundoNumero - El segundo numero a restar
 * @returns {number} El resultado de la resta de los dos numeros
 */
function restar(primerNumero, segundoNumero) {
	return primerNumero - segundoNumero
}

const numero1 = parseFloat(prompt("Ingrese el primer número:"))
const simbolo = prompt("Ingrese el símbolo de la operación que desea realizar: sumar o restar")
const numero2 = parseFloat(prompt("Ingrese el segundo número:"))

const h3 = document.querySelector("h3")

switch (simbolo) {
	case "+":
		h3.innerText = sumar(numero1, numero2)
		break
	case "-":
		h3.innerText = restar(numero1, numero2)
		break
	default:
		h3.innerText = "No ingresaste + o -"
}
