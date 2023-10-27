public class variableDeClase {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
                new Estudiante("Juan", "Perez", "JavaScript"),
                new Estudiante("Maria", "Gomez", "Java"),
                new Estudiante("Pedro", "Gonzalez", "TypeScript"),
                new Estudiante("Ana", "Garcia", "Go"),
                new Estudiante("Luis", "Rodriguez", "Zig")
        };

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.toString());
        }
    }
}
