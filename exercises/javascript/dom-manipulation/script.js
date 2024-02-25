const h3 = document.querySelector("h3");

/**
 * @param {number} edad
 * @param {boolean} deBarcelona
 * @param {boolean} tieneFamiliaNumerosa
 * @returns {void}
 */
function siPuedeTenerUnaBeca(edad, deBarcelona, tieneFamiliaNumerosa) {
  const puedeTenerBeca = "Puedes tener una beca";
  const noPuedeTenerBeca = "No puedes tener una beca";

  if (edad >= 18 && deBarcelona) h3.innerText = puedeTenerBeca;
  if (edad >= 30 && tieneFamiliaNumerosa) h3.innerText = puedeTenerBeca;
  else h3.innerText = noPuedeTenerBeca;
}

const edad = parseInt(prompt("¿Cuántos años tienes?"));
const deBarcelona = confirm("¿Eres de Barcelona?");
const tieneFamiliaNumerosa = confirm("¿Tienes familia numerosa?");

siPuedeTenerUnaBeca(edad, deBarcelona, tieneFamiliaNumerosa);
