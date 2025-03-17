public class Repuesto {
    private String marca;
    private String referencia;
    private int cantidad;
    private float precio;

    public Repuesto() {
    }

    public Repuesto(int cantidad, String marca, float precio, String referencia) {
        this.cantidad = cantidad;
        this.marca = marca;
        this.precio = precio;
        this.referencia = referencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


}
