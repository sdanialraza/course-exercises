package camarasFotograficas;

public class CamaraFotografica {
    private boolean esReflex;
    private String marca;
    private String modelo;
    private float precio;

    public CamaraFotografica(boolean esReflex, String marca, String modelo, float precio) {
        this.esReflex = esReflex;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getEsReflex() {
        return esReflex ? "es reflex" : "no es reflex";
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setEsReflex(boolean esReflex) {
        this.esReflex = esReflex;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return """
                CamaraFotografica {
                 esReflex: %b
                 marca: %s
                 modelo: %s
                 precio: %.1f
                 };
                """.formatted(esReflex, marca, modelo, precio);
    }
}
