package herencia;

public class herencia {
    public static void main(String[] args) {
        double salarioTotal = 0;

        Futbolista[] futbolistas = {
                new Futbolista("Lionel", "Messi", 33, 10, 5),
                new Futbolista("Cristiano", "Ronaldo", 35, 8, 3),
                new Futbolista("Neymar", "Jr", 28, 6, 4),
                new Futbolista("Kylian", "Mbappé", 21, 7, 2),
                new Futbolista("Sergio", "Ramos", 34, 2, 10),
                new Futbolista("Luis", "Suárez", 33, 9, 6),
                new Futbolista("Karim", "Benzema", 32, 5, 4),
                new Futbolista("Sergio", "Agüero", 32, 4, 3),
                new Futbolista("Robert", "Lewandowski", 31, 3, 2),
                new Futbolista("Zlatan", "Ibrahimovic", 38, 1, 1),
                new Futbolista("Eden", "Hazard", 29, 0, 0)
        };

        Entrenador[] entrenadores = {
                new Entrenador("Pep", "Guardiola", 49, 10),
                new Entrenador("Jürgen", "Klopp", 53, 8)
        };

        Directivo directivo = new Directivo("Josep", "Bartomeu", 57, true);

        for (Futbolista futbolista : futbolistas) {
            System.out.println(futbolista.toString());
            salarioTotal += futbolista.getSalario();
        }

        for (Entrenador entrenador : entrenadores) {
            System.out.println(entrenador.toString());
            salarioTotal += entrenador.getSalario();
        }

        System.out.println(directivo.toString());
        salarioTotal += directivo.getSalario();

        double mediaSalarios = salarioTotal / (futbolistas.length + entrenadores.length + 1);

        System.out.printf("Media salarios: %.2f", mediaSalarios);
    }
}
