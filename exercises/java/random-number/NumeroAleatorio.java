import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = (int) Math.floor(Math.random() * 100 + 1);

        System.out.println("Adivina el numero del 1 y 100");
        int adivina = scanner.nextInt();

        while (numeroSecreto != adivina) {
            if (adivina < numeroSecreto) System.out.println("Mayor");
            else System.out.println("Menor");

            adivina = scanner.nextInt();
        }

        System.out.printf("Lo has adivinado! El numero era %d", adivina);
    }
}
