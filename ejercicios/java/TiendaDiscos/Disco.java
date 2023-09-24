package TiendaDiscos;

public class Disco {
    private String artista;
    private String titulo;
    private Integer ano;
    /**
     * Duracion en segundos
     */
    private Integer duracion;

    public Disco(String artist, String titulo, Integer ano, Integer duracion) {
        this.artista = artist;
        this.titulo = titulo;
        this.ano = ano;
        this.duracion = duracion;
    }

    public Disco setArtista(String artista) {
        this.artista = artista;
        return this;
    }

    public Disco setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public Disco setAno(Integer ano) {
        this.ano = ano;
        return this;
    }

    public Disco setDuracion(Integer duracion) {
        this.duracion = duracion;
        return this;
    }

    public String getArtista() {
        return artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public Integer getDuracion() {
        return duracion;
    }
}
