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

    public void mostrarProductos(Producto[][] m){
        int c = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("\nProducto número "+c+" | Producto: "+m[i][j].getNombre()+" | "+"Precio: "+m[i][j].getPrecio()+" | "+"Stock: "+m[i][j].getCantidad()+"\n");
                c = c + 1;
            }
        }
    }
}
