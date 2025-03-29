public class Tablet {
    private String serial;
    private String tamaño;
    private String marca;
    private float precio;
    private String nombre_estudiante;
    private String carnet;
    private String disponibilidad;

    public Tablet() {
    }

    public Tablet(String serial, String tamaño, String marca, float precio, String nombre_estudiante,
        String disponibilidad, String carnet) {
        this.serial = serial;
        this.tamaño = tamaño;
        this.marca = marca;
        this.precio = precio;
        this.nombre_estudiante = nombre_estudiante;
        this.disponibilidad = disponibilidad;
        this.carnet = carnet;
    }

    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public String getTamaño() {
        return tamaño;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
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
    public String getDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    
    
}


