package constructorDeCohetes;

import java.util.Scanner;

public class CohetesLunar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CoheteLunar TAU01 = new CoheteLunar(58, "Titanio", 7, 800, 16_200);

        System.out.println("Cuantas horas de vuelo han pasado?");
        float horasDeVuelo = scanner.nextFloat();

        float distanciaAlcanzada = TAU01.distanciaAlcanzada(horasDeVuelo);

        System.out.printf("Se ha alcanzado %.1f km de distancia", distanciaAlcanzada);
    }
}
