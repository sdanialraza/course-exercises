const tieneGasolina = confirm("El coche no arranca\nTiene gasolina?")

if (tieneGasolina) {
	const tieneBateria = confirm("Tiene batería?")
	if (tieneBateria) alert("Pásate por el mecánico")
	else alert("Recargar batería")
} else {
	const tienesDinero = confirm("Hay que poner gasolina\nTienes dinero?")
	if (tienesDinero) alert("Poner gasolina")
	else alert("Vas en metro")
}