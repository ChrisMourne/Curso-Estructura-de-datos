public class Punto3 {
    public void libropreciomasAlto(Libro[][] l){
        float precio = 0;
        String autor = "";
        String libro = "";
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l.length; j++) {
                if (l[i][j].getPrecio() > precio) {
                    autor = l[i][j].getAutor();
                    libro = l[i][j].getTitulo();
                    precio = l[i][j].getPrecio();
                }
            }
        }
        System.out.println("El libro con mayor precio es "+libro+" de "+autor+" con un precio de "+precio);
    }
}
