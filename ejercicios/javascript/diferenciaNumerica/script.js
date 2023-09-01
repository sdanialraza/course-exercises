/**
 * @param {number} primerNumero
 * @param {number} segundoNumero
 * @returns {number} La diferencia entre los números
 */
function diferenciaNumerica(primerNumero, segundoNumero) {
	return Math.abs(primerNumero - segundoNumero)
}

const primerNumero = prompt("Introduce un numero:")
const segundoNumero = prompt("Introduce otro numero:")

alert(`La diferecia entre los numeros es: ${diferenciaNumerica(primerNumero, segundoNumero)}`)
