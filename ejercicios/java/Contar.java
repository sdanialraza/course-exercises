public class Contar {
    public static void main(String[] args) {
        final int NUMERO_INICIO = 1;
        final int NUMERO_FINAL = 100;

        int[] numeros = new int[NUMERO_FINAL - NUMERO_INICIO + 1];

        for (int i = NUMERO_INICIO; i <= NUMERO_FINAL; i++)
            numeros[i - NUMERO_INICIO] = i;

        for (int numero: numeros)
            System.out.printf("%d ", numero);
    }
}
