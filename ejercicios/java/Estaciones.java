import java.util.Scanner;

public class Estaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero entre 1 y 4");
        byte estacionNumero = scanner.nextByte();

        String estacion;

        switch (estacionNumero) {
            case 1 -> estacion = "Primavera";
            case 2 -> estacion = "Verano";
            case 3 -> estacion = "Otoño";
            case 4 -> estacion = "Invierno";
            default -> estacion = "Error! No has introducido un numero entre 1 y 4";
        }

        System.out.println(estacion);
    }
}
