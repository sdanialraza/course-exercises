package herencia;

class Entrenador extends Trabajador {
    private int experiencia;

    public Entrenador(String nombre, String apellido, double salario, int experiencia) {
        super(nombre, apellido, salario);

        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    @Override
    public String toString() {
        return """
                Nombre: %s
                Apellido: %s
                Salario: %.2f
                Experiencia: %d
                """.formatted(nombre, apellido, salario, experiencia);
    }
}