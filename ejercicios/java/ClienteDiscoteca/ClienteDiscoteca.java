package ClienteDiscoteca;

public class ClienteDiscoteca {
    private String nombre;
    private Integer edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        if (edad >= 18) this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return """
                ClienteDiscoteca {
                 nombre='%s',
                 edad='%d'
                };
                """.formatted(nombre, edad);
    }
}
