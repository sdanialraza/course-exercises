import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contrasena = "password";

        System.out.println("Introduce la contraseña");
        String introducidoContrasena = scanner.nextLine();

        if (introducidoContrasena.equals(contrasena)) System.out.println("Adelante, entra!");
        else System.out.println(("Password erróneo"));
    }
}
