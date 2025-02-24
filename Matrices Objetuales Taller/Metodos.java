import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    Almacen[][] llenarMatriz(){

        int d;
        System.out.print("Cuál es la dimensión de la matriz: ");
        d = sc.nextInt();

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

// Tienes dos matrices de objetos Producto, una para cada tienda, con atributos nombre, precio, stock. 
// Escribe un algoritmo que fusione ambas matrices sumando el stock de los productos idénticos. Los productos que no son idénticos 
// los debe agregar en la matriz resultante 

//Debo sumar el stock si los productos son identicos, y añadirlos a la nueva matriz resultante, además los que no son idénticos debo también agregarlos

    public void fusionMatrices() {
        Almacen[][] m1 = llenarMatriz();  
        Almacen[][] m2 = llenarMatriz();  
        
        int tamaño = m1.length * m1[0].length + m2.length * m2[0].length;
        Almacen[] fusionada = new Almacen[tamaño];
        int fusion = 0;

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                fusionada[fusion] = new Almacen(m1[i][j].getNombre(), m1[i][j].getPrecio(), m1[i][j].getCantidad());
                fusion++;
            }
        }
        
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                boolean bandera = false;

                for (int j2 = 0; j2 < fusion; j2++) {
                    if (fusionada[j2] != null && fusionada[j2].getNombre().equals(m2[i][j].getNombre())) {
                        fusionada[j2].setCantidad(fusionada[j2].getCantidad() + m2[i][j].getCantidad());
                        bandera = true;
                        break;
                    }
                }
                if (!bandera) {
                    fusionada[fusion] = new Almacen(m2[i][j].getNombre(), m2[i][j].getPrecio(), m2[i][j].getCantidad());
                    fusion++;
                }
            }
        }
        
        System.out.println("Matriz fusionada:");
        for (int i = 0; i < fusion; i++) { 
            System.out.println(fusionada[i].getNombre() + " Stock: " + fusionada[i].getCantidad());
        }       
    }    
}
