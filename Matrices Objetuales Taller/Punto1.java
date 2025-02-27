public class Punto1 {
    public void sumarCantidadProductos(Producto[][] m){
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                suma = suma + m[i][j].getCantidad();
            }
        }
        System.out.println("\nLos cantidad total de productos en el inventario es de: "+suma);
    }
}
