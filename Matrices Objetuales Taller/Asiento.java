public class Asiento {
    private int numero;
    private String fila;
    private float precio;
    
    public Asiento() {
    }

    public Asiento(int numero, String fila, float precio) {
        this.numero = numero;
        this.fila = fila;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
