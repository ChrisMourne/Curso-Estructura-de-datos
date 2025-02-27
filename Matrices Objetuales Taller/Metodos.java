import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    Producto[][] llenarMatriz(){

        int d;
        System.out.print("Cuál es la dimensión de la matriz: ");
        d = sc.nextInt();
        Producto[][] m = new Producto[d][d];
        int c = 1;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                Producto a = new Producto();
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

    Libro[][] llenarMatrizLibreria(int d){
        Libro[][] m = new Libro[d][d];
        int c = 1;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                Libro l = new Libro();
                sc.nextLine();
                System.out.println("\nLibro número "+ (c));
                System.out.print("Digite el nombre del libro: ");
                l.setTitulo(sc.nextLine());
                System.out.print("Digite el autor del libro: ");
                l.setAutor(sc.nextLine());
                System.out.print("Digite el precio del libro: ");
                l.setPrecio(sc.nextFloat());
                m[i][j] = l;
                c = c + 1;
            }
        }
        return m;
    }

    public void mostrarMatriz(Producto[][] m){
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

// Tienes dos matrices de objetos Producto, una para cada tienda, con atributos nombre, precio, stock. 
// Escribe un algoritmo que fusione ambas matrices sumando el stock de los productos idénticos. Los productos que no son idénticos 
// los debe agregar en la matriz resultante 

//Debo sumar el stock si los productos son identicos, y añadirlos a la nueva matriz resultante, además los que no son idénticos debo también agregarlos

    public void fusionMatrices() {
        Producto[][] m1 = llenarMatriz();  
        Producto[][] m2 = llenarMatriz();  
        
        int tamaño = m1.length * m1[0].length + m2.length * m2[0].length;
        Producto[] fusionada = new Producto[tamaño];
        int fusion = 0;

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                fusionada[fusion] = new Producto(m1[i][j].getNombre(), m1[i][j].getPrecio(), m1[i][j].getCantidad());
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
                    fusionada[fusion] = new Producto(m2[i][j].getNombre(), m2[i][j].getPrecio(), m2[i][j].getCantidad());
                    fusion++;
                }
            }
        }
        
        System.out.println("Matriz fusionada:");
        for (int i = 0; i < fusion; i++) { 
            System.out.println(fusionada[i].getNombre() + " Stock: " + fusionada[i].getCantidad());
        }       
    }
    public Producto[][] SumarStock(Producto[][] m, Producto[][] n){
        if (m.length > n.length) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j <  m.length; j++) {
                    for (int i2 = 0; i2 < n.length; i2++) {
                        for (int j2 = 0; j2 < n.length; j2++) {
                            if (m[i][j].getNombre().equalsIgnoreCase(n[i2][j2].getNombre())) {
                                m[i][j].setCantidad(m[i][j].getCantidad() + n[i2][j2].getCantidad());
                            }
                        }
                    }
                }
            }
        return m;
        }
        else if (m.length < n.length)             
        {
            for (int i = 0; i < n.length; i++) {
                for (int j = 0; j < n.length; j++) {
                  for (int i2 = 0; i2 < n.length; i2++) {
                    for (int j2 = 0; j2 < n.length; j2++) {
                        if (n[i][j].getNombre().equalsIgnoreCase(m[i2][j2].getNombre())) {
                            n[i][j].setCantidad(m[i][j].getCantidad() + n[i2][j2].getCantidad());
                        }
                    }
                  }  
                }
            }
            return n;
        }
        else{
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j <  m.length; j++) {
                    for (int i2 = 0; i2 < n.length; i2++) {
                        for (int j2 = 0; j2 < n.length; j2++) {
                            if (m[i][j].getNombre().equalsIgnoreCase(n[i2][j2].getNombre())) {
                                m[i][j].setCantidad(m[i][j].getCantidad() + n[i2][j2].getCantidad());
                            }
                        }
                    }
                }
            }
            return m;
        }
    }

    public void fusion(){
    
    }
}
