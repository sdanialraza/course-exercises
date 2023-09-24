package ClienteDiscoteca;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientesDiscoteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ClienteDiscoteca> clientesDiscoteca = new ArrayList<>();

        ClienteDiscoteca clienteDiscoteca = new ClienteDiscoteca();

        System.out.println("Cuantas personas quieren entrar?");
        int cantidad = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Como te llamas?");
            String nombre = scanner.nextLine();

            System.out.println("Cuantos años tienes?");
            Integer edad = scanner.nextInt();

            scanner.nextLine();

            clienteDiscoteca.setEdad(edad);

            if (edad.equals(clienteDiscoteca.getEdad())) {
                clienteDiscoteca.setNombre(nombre);

                clientesDiscoteca.add(clienteDiscoteca);
                System.out.printf("Benivenid@s, %s (%d) a nuestra discoteca!\n", clienteDiscoteca.getNombre(), clienteDiscoteca.getEdad());
            } else {
                System.out.println("No puedes entrar porque no tienes 18 años o mas");
            }
        }

        for (ClienteDiscoteca clienteDiscoteca1 : clientesDiscoteca) {
            System.out.printf("""
                    Nombre: %s
                    Edad: %d
                    """, clienteDiscoteca1.getNombre(), clienteDiscoteca1.getEdad());
        }
    }
}
