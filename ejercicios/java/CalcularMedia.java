import java.util.ArrayList;
import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos numeros quieres entrar?");
        int cantidad = scanner.nextInt();

        ArrayList<Float> numeros = new ArrayList<>(cantidad);

        for (int i = 0; i < cantidad; i++) {
            System.out.printf("Introduce el %d numero:\n", i + 1);
            numeros.add(scanner.nextFloat());
        }

        System.out.printf("La media de los números: %.1f", calcularMedia(numeros));
    }

    public static float calcularMedia(ArrayList<Float> numeros) {
        /* return numeros.stream().reduce(0F, (acumulador, numero) -> acumulador + numero) / numeros.size() */
        return numeros.stream().reduce(0F, Float::sum) / numeros.size();
    }
}
