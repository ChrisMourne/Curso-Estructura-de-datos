public class Computador{

    private String serial;
    private String marca;
    private String ram;
    private String disco;
    private float precio;
    private String nombre_estudiante;
    private String carnet;
    private String disponibilidad;

    public Computador() {
    }

    public Computador(String serial, String marca, String ram, String disco, float precio, String nombre_estudiante,
            String carnet, String disponibilidad) {
        this.serial = serial;
        this.marca = marca;
        this.ram = ram;
        this.disco = disco;
        this.precio = precio;
        this.nombre_estudiante = nombre_estudiante;
        this.carnet = carnet;
        this.disponibilidad = disponibilidad;
    }

    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getDisco() {
        return disco;
    }
    public void setDisco(String disco) {
        this.disco = disco;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getNombre_estudiante() {
        return nombre_estudiante;
    }
    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }
    public String getCarnet() {
        return carnet;
    }
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public String getDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}