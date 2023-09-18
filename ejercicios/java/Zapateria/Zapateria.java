package Zapateria;

import java.util.Scanner;

public class Zapateria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Casual casual1 = new Casual("Vans", "Tela", 45F);
        Casual casual2 = new Casual("Steve Madden", "Cuero", 50F);

        Deporte deporte1 = new Deporte("Adidas", "Polister", 90F);
        Deporte deporte2 = new Deporte("Nike", "Poliester", 85F);

        Elegante elegante1 = new Elegante("Clarks", "Cuero", 50F);
        Elegante elegante2 = new Elegante("Hush Puppies", "Cuero", 45F);

        float gastoTotal = 0;

        System.out.println("Cuantos zapatos quieres comprar?");
        int cantidad = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println(
                    """
                            Que marca de zapatos quieres comprar?
                            Casual
                            - Vans
                            - Steve Maddens
                            Deporte
                            - Adidas
                            - Nike
                            Elegante
                            - Clarks
                            - Hush Puppies
                                                
                            - Salir
                            """
            );
            String marca = scanner.nextLine();

            switch (marca) {
                case "Vans" -> gastoTotal += casual1.getPrecio();
                case "Steve Maddens" -> gastoTotal += casual2.getPrecio();

                case "Adidas" -> gastoTotal += deporte1.getPrecio();
                case "Nike" -> gastoTotal += deporte2.getPrecio();

                case "Clarks" -> gastoTotal += elegante1.getPrecio();
                case "Hush Puppies" -> gastoTotal += elegante2.getPrecio();
            }
        }

        System.out.printf("El gasto total es: %.1f", gastoTotal);
    }
}
