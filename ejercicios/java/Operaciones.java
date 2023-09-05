import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        int primerNumero = scanner.nextInt();

        System.out.println("Introduce el segundo numero");
        int segundoNumero = scanner.nextInt();

        System.out.println("Introduce el signo (+,-,*,/)");
        String signo = scanner.nextLine();

        switch (signo) {
            case "+" -> System.out.println(primerNumero + segundoNumero);
            case "-" -> System.out.println(primerNumero - segundoNumero);
            case "*" -> System.out.println(primerNumero * segundoNumero);
            case "/" -> System.out.println((float) primerNumero / (float) segundoNumero);
            default -> System.out.println("No introdujiste un signo valido");
        }
    }
}
