package TiendaDiscos;

import java.util.ArrayList;
import java.util.Scanner;

public class TiendaDiscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos discos quieres entrar?");
        int cantidad = scanner.nextInt();

        ArrayList<Disco> discos = new ArrayList<>(cantidad);

        for (int i = 0; i < cantidad; i++) {
            scanner.nextLine();

            System.out.println("Introduce el/la artista");
            String artista = scanner.nextLine();

            System.out.println("Introduce el titulo");
            String titulo = scanner.nextLine();

            System.out.println("Introduce el año");
            Integer ano = scanner.nextInt();

            System.out.println("Introduce la duracion en segundos");
            Integer duracion = scanner.nextInt();

            discos.add(new Disco(artista, titulo, ano, duracion));
        }

        for (Disco disco: discos) {
            System.out.printf(
                    """
                    Artista: %s
                    Titulo: %s
                    Año: %d
                    Duracion: %d
                    %n""",
                    disco.getArtista(), disco.getTitulo(), disco.getAno(), disco.getDuracion());
        }
    }
}
