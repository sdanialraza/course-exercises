import java.util.ArrayList;
import java.util.Scanner;

public class Paises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUMERO_PAISES = 6;
        ArrayList<String> paises = new ArrayList<>(NUMERO_PAISES);

        for (int i = 0; i < NUMERO_PAISES; i++) {
            System.out.printf("Introduce el %d pais que has estado:\n", i + 1);
            paises.add(scanner.nextLine());
        }

        System.out.printf("Has estado en %s, %s, %s, %s, %s, y por ultimo, en %s", paises.get(0), paises.get(1), paises.get(2), paises.get(3), paises.get(4), paises.get(5));
    }
}
