const coches = [
	{ marca: "Toyota", modelo: "Corolla", potencia: 150, precio: 25_000 },
	{ marca: "Honda", modelo: "Civic", potencia: 180, precio: 28000 },
	{ marca: "Ford", modelo: "Focus", potencia: 120, precio: 22000 },
]

const caracteristica = prompt("Introduzca la caracteristica que le gustaria ver")

const table = document.querySelector("table")

switch (caracteristica.toLowerCase()) {
	case "marca":
		coches.map(coche => document.write(`<h3>${coche.marca}</h3>`)).join("\n")
		break
	case "modelo":
		coches.map(coche => document.write(`<h3>${coche.modelo}</h3>`)).join("\n")
		break
	case "potencia":
		coches.map(coche => document.write(`<h3>${coche.potencia}</h3>`)).join("\n")
		break
	case "precio":
		coches.map(coche => document.write(`<h3>${coche.precio}</h3>`)).join("\n")
		break
	default:
		table.innerHTML = `
        <tr>
            <th>Marca</th>
            <th>Modelo</th>
            <th>Potencia</th>
            <th>Precio</th>
        </tr>`
		coches.map(({ marca, modelo, potencia, precio }) => {
			table.innerHTML += `
		    <tr>
			    <td>${marca}</td>
			    <td>${modelo}</td>
			    <td>${potencia}</td>
			    <td>${precio}</td>
		    </tr>
            `
		})
		document.write("<br /> <h3>No introdujiste una característica válida</h3>")
}
