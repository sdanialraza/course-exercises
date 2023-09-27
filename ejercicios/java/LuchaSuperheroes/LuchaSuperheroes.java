package LuchaSuperheroes;

import java.util.ArrayList;
import java.util.HashMap;

public class LuchaSuperheroes {
    public static void main(String[] args) {
        ArrayList<Superhero> superheroes = new ArrayList<>() {{
            add(new Superhero("Batman"));
            add(new Superhero("Ironman"));
            add(new Superhero("Superman"));
        }};

        HashMap<String, Integer> puntuaciones = new HashMap<>();

        System.out.println("Puntuaciones:");

        for (Superhero superhero : superheroes) {
            System.out.printf("%s: %d\n", superhero.getNombre(), superhero.getPuntuacion());
            puntuaciones.put(superhero.getNombre(), superhero.getPuntuacion());
        }

        int maximoPuntacion = buscarMaximoPuntacion(puntuaciones);

        System.out.printf("\n%s ha ganado la lucha con %d puntos.", buscarClave(puntuaciones, maximoPuntacion), maximoPuntacion);
    }

    public static String buscarClave(HashMap<String, Integer> puntuaciones, int valor) {
        for (String clave : puntuaciones.keySet())
            if (puntuaciones.get(clave) == valor) return clave;

        return null;
    }

    public static int buscarMaximoPuntacion(HashMap<String, Integer> map) {
        int max = 0;

        for (int value : map.values())
            if (value > max) max = value;

        return max;
    }
}