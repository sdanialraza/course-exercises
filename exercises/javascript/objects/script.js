const galletas = {
  marca: "Artiach",
  nombre: "Chiquilín",
  descripción: "galletas de mantequilla",
  precio: 2.75,
  hayExistencias: true,
};

document.write("<h2> Objeto inicial </h2>");
document.write(`<h3> ${JSON.stringify(galletas, null, 2)} </h3>`);

galletas.oferta = true;
document.write("<h2> Objeto con nuevo propiedad `oferta` </h2>");
document.write(`<h3> ${JSON.stringify(galletas, null, 2)} </h3>`);

galletas.descripción = "galletas con pepitas de chocolate";
document.write("<h2> Objeto con el propiedad `descripción` modificado</h2> ");
document.write(`<h3> ${JSON.stringify(galletas, null, 2)} </h3>`);

delete galletas.hayExistencias;
document.write("<h2> Objeto con propiedad `hayExistencias` eliminado</h2> ");
document.write(`<h3> ${JSON.stringify(galletas, null, 2)} </h3>`);

document.write("<h2> Todas las claves del objeto </h2>");
document.write(`<h3> ${Object.keys(galletas).join(", ")} </h3>`);

document.write("<h2> Todas las valores del objeto </h2>");
document.write(`<h3> ${Object.values(galletas).join(", ")} </h3>`);
