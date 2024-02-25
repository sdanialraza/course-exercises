/**
 * @param {number} radio El radio del círculo
 * @returns El area del circulo
 */
function areaCirculo(radio) {
  return (Math.PI * Math.pow(radio, 2)).toFixed(2);
}

const radio = prompt("Introduce el radio del círculo");

alert(`El area del circulo es: ${areaCirculo(radio)}`);
