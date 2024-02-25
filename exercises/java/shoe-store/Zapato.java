package Zapateria;

public class Zapato {
    protected String marca;
    protected String material;
    protected float precio;

    public Zapato(String marca, String material, float precio) {
        this.marca = marca;
        this.material = material;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getMaterial() {
        return material;
    }

    public float getPrecio() {
        return precio;
    }

    public Zapato setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public Zapato setMaterial(String material) {
        this.material = material;
        return this;
    }

    public Zapato setPrecio(float precio) {
        this.precio = precio;
        return this;
    }

    @Override
    public String toString() {
        return """
                Zapato {
                 marca: %s
                 material: %s
                 precio: %.2f
                }
                """.formatted(marca, material, precio);
    }
}