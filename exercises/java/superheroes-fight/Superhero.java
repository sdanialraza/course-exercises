package LuchaSuperheroes;

public class Superhero {
    protected String nombre;
    protected int puntuacion;

    public Superhero(String nombre) {
        this.nombre = nombre;
        this.puntuacion = (int) Math.floor(Math.random() * 100);
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return """
                 Superhero {
                  nombre: %s
                  puntuacion: %d
                 };
                """.formatted(nombre, puntuacion);
    }
}
