import java.util.Scanner;

public class Informacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Como te llamas?");
        String nombre = scanner.nextLine();

        System.out.println("Cuantos años tienes?");
        int edad = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Donde vives?");
        String residencia = scanner.nextLine();

        String resultado = printInfo(nombre, edad, residencia);
        System.out.println(resultado);
    }
    public static String printInfo(String nombre, int edad, String residencia) {
        return "%s tiene %d y vive en %s".formatted(nombre, edad, residencia);
    }
}
