import java.text.MessageFormat;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        int primerNumero = scanner.nextInt();

        System.out.println("Introduce el segundo numero");
        int segundoNumero = scanner.nextInt();

        float producto = (float) primerNumero / (float) segundoNumero;
        System.out.println(MessageFormat.format("{0} / {1} es {2}", primerNumero, segundoNumero, producto));
    }
}
