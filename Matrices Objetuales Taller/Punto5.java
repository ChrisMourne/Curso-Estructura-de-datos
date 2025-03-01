public class Punto5 {
    public void disponibilidadProducto(ProductoSuper[][] m){
        
        int c = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].isDisponibilidad()) {
                    c = c+1;
                }
            }
        }
        ProductoSuper[][] m2 = new ProductoSuper[1][c];
        int c2 = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].isDisponibilidad()) {
                    m2[0][c2] = m[i][j];
                    c2 = c2 + 1;
                }
            }
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("\nNombre: "+m2[i][j].getNombre()+" | "+"Precio: "+m2[i][j].getPrecio()+" | "+"Disponilidad: "+m2[i][j].isDisponibilidad()+"\n");
            }
        }
    }
}
