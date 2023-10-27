package herencia;

class Directivo extends Trabajador {
    private boolean fumaPuros;

    public Directivo(String nombre, String apellido, double salario, boolean fumaPuros) {
        super(nombre, apellido, salario);

        this.fumaPuros = fumaPuros;
    }

    public boolean isFumaPuros() {
        return fumaPuros;
    }

    @Override
    public String toString() {
        return """
                Nombre: %s
                Apellido: %s
                Salario: %.2f
                Fuma puros: %b
                """.formatted(nombre, apellido, salario, fumaPuros);
    }
}