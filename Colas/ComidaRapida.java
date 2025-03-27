public class ComidaRapida {
    private String tipoC;
    private int cantidad;
    private float precio;
    private String cliente;

    public ComidaRapida() {
    }

    public ComidaRapida(ComidaRapida c) {
        this.tipoC = c.tipoC;
        this.cantidad = c.cantidad;
        this.precio = c.precio;
        this.cliente = c.cliente;
    }

    public ComidaRapida(String tipoC, int cantidad, float precio, String cliente) {
        this.tipoC = tipoC;
        this.cantidad = cantidad;
        this.precio = precio;
        this.cliente = cliente;
    }

    public String getTipoC() {
        return tipoC;
    }
    public void setTipoC(String tipoC) {
        this.tipoC = tipoC;
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
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
}
