/**
 * @param {number} altura
 * @param {number} edad
 */
function calcularPesoIdeal(altura, edad) {
  return altura - 100 + (edad / 10) * 0.9;
}

const button = document.querySelector("button");
const h3 = document.querySelector("h3");

button.addEventListener("click", () => {
  let altura = document.querySelector("#altura").value;
  let edad = document.querySelector("#edad").value;

  h3.innerText = "Calculando...";

  setTimeout(() => (h3.innerText = `Peso Ideal: ${calcularPesoIdeal(altura, edad)} kg`), 500);
});
