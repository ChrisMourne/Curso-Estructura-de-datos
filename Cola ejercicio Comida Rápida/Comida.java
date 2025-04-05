public class Comida {
    private String tipoComida;
    private float precio;
    private int cantidad;
    private String nombreCliente;

    public Comida() {

    }

    public Comida(String tipoComida, float precio, int cantidad, String nombreCliente) {
        this.tipoComida = tipoComida;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }  
    
}
