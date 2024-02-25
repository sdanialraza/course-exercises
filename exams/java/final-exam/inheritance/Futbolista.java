package herencia;

public class Futbolista extends Trabajador {
    private int golesMarcados;
    private int tarjetasRecibidas;

    public Futbolista(String nombre, String apellido, double salario, int golesMarcados, int tarjetasRecibidas) {
        super(nombre, apellido, salario);

        this.golesMarcados = golesMarcados;
        this.tarjetasRecibidas = tarjetasRecibidas;
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }

    public int getTarjetasRecibidas() {
        return tarjetasRecibidas;
    }

    @Override
    public String toString() {
        return """
                Nombre: %s
                Apellido: %s
                Salario: %.2f
                Goles marcados: %d
                Tarjetas recibidas: %d
                """.formatted(nombre, apellido, salario, golesMarcados, tarjetasRecibidas);
    }
}
