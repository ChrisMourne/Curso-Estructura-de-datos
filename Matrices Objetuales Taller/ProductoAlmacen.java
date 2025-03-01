public class ProductoAlmacen {
    private String nombre;
    private float peso;
    private String categoria;

    public ProductoAlmacen() {
    }
    public ProductoAlmacen(String nombre, float peso, String categoria) {
        this.nombre = nombre;
        this.peso = peso;
        this.categoria = categoria;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
