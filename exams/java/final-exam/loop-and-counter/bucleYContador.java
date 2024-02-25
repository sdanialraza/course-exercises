import java.util.Scanner;

public class bucleYContador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hombres = 0;
        int mujeres = 0;

        while (true) {
            System.out.println("Introduce tu nombre o 'exit' para salir:");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Introduce tu edad o 'exit' para salir:");
            int edad = scanner.nextInt();

            scanner.nextLine();

            if (edad < 18) {
                System.out.println("Lo siento, no puedes entrar");
                break;
            }

            System.out.println("Introduce tu sexo (H/M) o 'exit' para salir:");

            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("exit")) {
                break;
            }

            if (sexo.equalsIgnoreCase("H")) {
                hombres++;
            } else if (sexo.equalsIgnoreCase("M")) {
                mujeres++;
            } else {
                System.out.println("Sexo no válido");
                break;
            }
        }

        System.out.println("""
                Cantidad de hombres: %d
                Cantidad de mujeres: %d
                """.formatted(hombres, mujeres));

        scanner.close();
    }
}
