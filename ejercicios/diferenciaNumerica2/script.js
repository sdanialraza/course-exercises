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

if (primerNumero <= segundoNumero) alert("El segundo numero debe ser menor que primer numero")
else if (isNaN(primerNumero) || isNaN(segundoNumero)) alert("Por favor introduce numeros")
else alert(`La diferecia entre los numeros es: ${diferenciaNumerica(primerNumero, segundoNumero)}`)
