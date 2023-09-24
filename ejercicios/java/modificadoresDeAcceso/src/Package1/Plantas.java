package Package1;

public class Plantas {
    protected String color;
    protected float precio;

    public Plantas(String color, float precio) {
        this.color = color;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public float getPrecio() {
        return precio;
    }

    public Plantas setColor(String color) {
        this.color = color;
        return this;
    }

    public Plantas setPrecio(float precio) {
        this.precio = precio;
        return this;
    }

    @Override
    public String toString() {
        return """
                Plantas {
                 color: %s
                 precio: %.1f
                }
                """.formatted(color, precio);
    }
}
