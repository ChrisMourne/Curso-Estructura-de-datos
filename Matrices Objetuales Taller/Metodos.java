import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    Almacen[][] llenarMatriz(int d){
        Almacen[][] m = new Almacen[d][d];
        int c = 1;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                Almacen a = new Almacen();
                System.out.println("\nProducto número "+ (c));
                System.out.print("Digite el nombre del producto: ");
                a.setNombre(sc.next());
                System.out.print("Digite su valor: ");
                a.setPrecio(sc.nextFloat());
                System.out.print("Digite la cantidad: ");
                a.setCantidad(sc.nextInt());
                m[i][j] = a;
                c = c + 1;
            }
        }
        return m;
    }

    Libreria[][] llenarMatrizLibreria(int d){
        Libreria[][] m = new Libreria[d][d];
        int c = 1;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                Libreria l = new Libreria();
                System.out.println("\nLibro número "+ (c));
                System.out.print("Digite el nombre del libro: ");
                l.setTitulo(sc.nextLine());
                System.out.print("Digite el autor del libro: ");
                l.setAutor(sc.nextLine());
                System.out.print("Digite el precio del libro: ");
                m[i][j] = l;
                c = c + 1;
            }
        }
        return m;
    }

    public void mostrarMatriz(Almacen[][] m){
        int c = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("\nProducto número "+c+" | Producto: "+m[i][j].getNombre()+" | "+"Precio: "+m[i][j].getPrecio()+" | "+"Stock: "+m[i][j].getCantidad()+"\n");
                c = c + 1;
            }
        }
    }

    public int dimension(){
        int d;
        System.out.print("Cuál es la dimensión de la matriz: ");
        d = sc.nextInt();
        return d;
    }

    public void encontrarProducto(Almacen[][] m){
        String p;
        sc.nextLine();
        System.out.print("¿Qué producto desea encontrar?: ");
        p = sc.nextLine();
        Boolean s = false;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getNombre().equals(p)) {
                    System.out.println("\nEl producto esta en la fila "+i+" y en la columna "+j+"\n");
                    System.out.println("Sus datos son los siguientes: ");
                    System.out.println("Producto: "+m[i][j].getNombre()+" "+"Precio: "+m[i][j].getPrecio()+" "+"Stock: "+m[i][j].getCantidad());
                    s = true;

                    break;
                }
            }
        }
        if (s == false) {
            System.out.println("\nNo se encontró el producto.");
        }
    }

    public void sumarCantidadProductos(Almacen[][] m){
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                suma = suma + m[i][j].getCantidad();
            }
        }
        System.out.println("\nLos cantidad total de productos en el inventario es de: "+suma);
    }
}
