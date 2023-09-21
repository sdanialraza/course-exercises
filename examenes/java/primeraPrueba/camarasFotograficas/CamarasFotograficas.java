package camarasFotograficas;

import java.util.Scanner;

public class CamarasFotograficas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CamaraFotografica[] camaras = {
                new CamaraFotografica(true, "Sony", "Alpha 6100", 350),
                new CamaraFotografica(true, "Nikon", "Astro AZ422", 200),
                new CamaraFotografica(true, "Canon", "EOS Rebel T7", 400)
        };

        String opciones = """
                1- Ver todo (Todos los campos de todas las camaras)
                2- Ver todos los modelos
                3- Ver todos si es reflex o no (Modelo: es reflex)
                4- Ver todos los precios (Modelo: Precio)
                5- Salir
                """;

        System.out.println(opciones);
        int opcion = scanner.nextInt();

        while (opcion <= 5) {
            switch (opcion) {
                case 1 -> {
                    for (CamaraFotografica camara : camaras) {
                        System.out.println(camara);
                    }
                }
                case 2 -> {
                    for (CamaraFotografica camara : camaras) {
                        System.out.println(camara.getModelo());
                    }
                }
                case 3 -> {
                    for (CamaraFotografica camara : camaras) {
                        System.out.printf("%s: %s\n", camara.getModelo(), camara.getEsReflex());
                    }
                }
                case 4 -> {
                    for (CamaraFotografica camara : camaras) {
                        System.out.printf("%s: %.1f\n", camara.getModelo(), camara.getPrecio());
                    }
                }
                default -> {
                    return;
                }
            }

            System.out.println("\n");
            System.out.println(opciones);
            opcion = scanner.nextInt();
        }
    }
}
