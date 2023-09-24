import java.text.MessageFormat;
import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int primerNumero = scanner.nextInt();

        System.out.println("Introduce otro numero");
        int segundoNumero = scanner.nextInt();

        int suma = primerNumero + segundoNumero;
        System.out.println(MessageFormat.format("La suma de {0} + {1} es {2}", primerNumero, segundoNumero, suma));
    }
}
