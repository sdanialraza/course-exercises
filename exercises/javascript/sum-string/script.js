const nombre = prompt("¿Como te llamas?");
const ciudad = prompt("¿En que ciudad vives?");
const hobby = prompt("¿Cual es tu hobby favorito?");

/**
 * El mensaje que se enviara en alert, console y se mostrara en la pagina
 */
const mensaje = `Te llamas ${nombre}, vives en ${ciudad}, y te gusta ${hobby.toLowerCase()}`;

alert(mensaje);
console.log(mensaje);
document.write(mensaje);
