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

    Libro[][] llenarMatrizLibreria(){
        
        int d;
        System.out.print("Cuál es la dimensión de la matriz: ");
        d = sc.nextInt();
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

    Asiento[][] llenarMatrizAsientos(){
        int d;
        System.out.print("¿Cuál es la dimensión de la matriz de los asientos?: ");
        d = sc.nextInt();
        int f = 1;
        int n = 1;

        Asiento[][] m = new Asiento[d][d];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (n > m.length) {
                    n = 1;
                    f = f + 1;
                }
                Asiento a = new Asiento();
                a.setFila(f);
                a.setNumero(n);
                a.setPrecio((float)Math.random()*10+1);
                m[i][j] = a;
                n = n + 1;
                
            }
        }
        return m;
    }

    ProductoSuper[][] llenarmatrizSuper(){
        int d;
        System.out.print("¿Cuál es la dimensión que tiene la matriz de los productos del supermercado?: ");
        d = sc.nextInt();
        int c = 1;
        ProductoSuper[][] m = new ProductoSuper[d][d];
        sc.nextLine();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ProductoSuper p = new ProductoSuper();

                System.out.println("Producto número: "+c);
                System.out.print("Digite el nombre del producto: ");
                p.setNombre(sc.nextLine());
                p.setPrecio((float)(Math.random()*10+1));
                System.out.print("¿Disponible? digite (true/false): ");
                p.setDisponibilidad(sc.nextBoolean());
                m[i][j] = p;
                c = c + 1;
            }
        }
        return m;
    }

    Estudiante[][] llenarMatrizEstudiantes(){
        int d;
        System.out.print("¿Cuál es la dimensión que tiene la matriz de los estudiantes?: ");
        d = sc.nextInt();
        Estudiante[][] m = new Estudiante[d][d];
        sc.nextLine();
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                Estudiante e = new Estudiante();
                System.out.print("Nombre: ");
                e.setNombre(sc.nextLine());
                System.out.print("Calificación: ");
                e.setCalificacion(sc.nextLine().toUpperCase());
                m[i][j] = e;
            }
        }
        return m;
    }
}
