package constructorDeCohetes;

public class CoheteLunar {
    private float altura;
    private String material;
    private int numDeTripulantes;
    private float peso;
    private float velocidadMaxima;

    public CoheteLunar(float altura, String material, int numDeTripulantes, float peso, float velocidadMaxima) {
        this.altura = altura;
        this.material = material;
        this.numDeTripulantes = numDeTripulantes;
        this.peso = peso;
        this.velocidadMaxima = velocidadMaxima;
    }

    public float getAltura() {
        return altura;
    }

    public String getMaterial() {
        return material;
    }

    public int getNumDeTripulantes() {
        return numDeTripulantes;
    }

    public float getPeso() {
        return peso;
    }

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public CoheteLunar setAltura(float altura) {
        this.altura = altura;
        return this;
    }

    public CoheteLunar setMaterial(String material) {
        this.material = material;
        return this;
    }

    public CoheteLunar setNumDeTripulantes(int numDeTripulantes) {
        this.numDeTripulantes = numDeTripulantes;
        return this;
    }

    public CoheteLunar setPeso(float peso) {
        this.peso = peso;
        return this;
    }

    public CoheteLunar setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
        return this;
    }

    public float distanciaAlcanzada(float horasDeVuelo) {
        return horasDeVuelo * this.velocidadMaxima;
    }

    @Override
    public String toString() {
        return """
                 CoheteLunar {
                  altura: %.1f
                  material: %s
                  numDeTripulantes: %d
                  peso: %.1f
                  velocidadMaxima: %.1f
                 };
                """.formatted(altura, material, numDeTripulantes, peso, velocidadMaxima);
    }
}
