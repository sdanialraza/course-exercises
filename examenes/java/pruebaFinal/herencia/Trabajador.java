package herencia;

public class Trabajador {
    protected String nombre;
    protected String apellido;
    protected double salario;

    public Trabajador(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }

    public String celebrarGol() {
        return "Gol!";
    }

    @Override
    public String toString() {
        return """
                Nombre: %s
                Apellido: %s
                Salario: %.2f
                """.formatted(nombre, apellido, salario);
    }
}