package Package2;

public class Animales {
    protected String nombre;

    public Animales(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Animales setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public String toString() {
        return """
               Animales {
                nombre: %s
               }
               """.formatted(nombre);
    }
}
