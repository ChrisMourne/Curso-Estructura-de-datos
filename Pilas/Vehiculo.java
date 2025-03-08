public class Vehiculo {
    private String marca;
    private String color;
    private Double precio;

    public Vehiculo() {
    }

    public Vehiculo(String color, String marca, Double precio) {
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    
}
