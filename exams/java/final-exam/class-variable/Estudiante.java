import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String curso;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCurso() {
        return curso;
    }

    public Estudiante setId(int id) {
        this.id = id;
        return this;
    }

    public Estudiante setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Estudiante setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public Estudiante setCourse(String curso) {
        this.curso = curso;
        return this;
    }

    @Override
    public String toString() {
        return """
                nombre: %s
                apellido: %s
                curso: %s
                """.formatted(nombre, apellido, curso);
    }
}
