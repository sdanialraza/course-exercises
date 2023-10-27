package crearRectangulo;

import java.util.Scanner;

public class crearRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la altura del rectángulo: ");
        int altura = scanner.nextInt();

        System.out.println("Introduce la anchura del rectángulo: ");
        int anchura = scanner.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
