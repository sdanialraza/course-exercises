import java.util.Scanner;

public class Cacatua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que comida quieres dar al cacatua?");
        String comida = scanner.nextLine();

        while (!comida.equalsIgnoreCase("Cacahuetes")) {
            System.out.println("Cacatua cacahuete!");
            comida = scanner.nextLine();
            if (comida.equalsIgnoreCase("cacahuetes")) System.out.println(dormirse());
        }
    }

    public static String dormirse() {
        return "Zzz...";
    }
}
