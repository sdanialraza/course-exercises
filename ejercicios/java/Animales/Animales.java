import java.util.Scanner;

public class Animales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos animales quieres entrar?");
        int cantidad = scanner.nextInt();

        String[] animales = new String[cantidad];

        scanner.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.printf("Introduce el %d animal:\n", i + 1);
            animales[5] = scanner.nextLine();
        }

        for (String animal : animales)
            System.out.printf("%s\n", animal);
    }
}
