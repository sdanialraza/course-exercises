package Zapateria;

public class Elegante extends Zapato {
    private boolean tieneHebilla;

    public Elegante(String marca, String material, float precio) {
        super(marca, material, precio);
    }

    public boolean tieneHebilla() {
        return tieneHebilla;
    }

    public Elegante setTieneHebilla(boolean tieneHebilla) {
        this.tieneHebilla = tieneHebilla;
        return this;
    }

    @Override
    public String toString() {
        return """
                Zapato {
                 marca: %s
                 material: %s
                 precio: %.2f
                 tieneHebilla: %b
                }
                """.formatted(marca, material, precio, tieneHebilla);
    }
}
