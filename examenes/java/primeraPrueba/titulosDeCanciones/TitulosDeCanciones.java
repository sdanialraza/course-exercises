import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TitulosDeCanciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> canciones = new ArrayList<>();

        String mensaje = "Introduce una canción o \"salir\" para salir";

        System.out.println(mensaje);
        String inputCancion = scanner.nextLine();

        while (!inputCancion.equalsIgnoreCase("Salir")) {
            canciones.add(inputCancion);

            System.out.println(mensaje);
            inputCancion = scanner.nextLine();
        }

        canciones.sort(Comparator.naturalOrder());

        for (String cancion : canciones) {
            System.out.println(cancion);
        }
    }
}
