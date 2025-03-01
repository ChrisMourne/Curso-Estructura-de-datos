import java.util.Scanner;

public class Principal{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Metodos f = new Metodos();
        Punto1 p1 = new Punto1();
        Punto2 p2 = new Punto2();
        Punto3 p3 = new Punto3();
        Punto4 p4 = new Punto4();
        Punto5 p5 = new Punto5();
        Punto6 p6 = new Punto6();
        Punto7 p7 = new Punto7();
        
        byte opcion = 0;

        Estudiante[][] matrizE = new Estudiante[0][0];
        ProductoSuper[][] matrizSuper = new ProductoSuper[0][0];
        Producto[][] matriz = new Producto[0][0];
        Libro[][] matrizL = new Libro[0][0];
        Asiento[][] matrizA = new Asiento[0][0];


        System.out.println("\n----- MENU PRINCIPAL -----");
        
        System.out.println("¿Qué ejercicio desea ver?");
        System.out.print("1. Almacen\n2. Libreria\n3. Teatro\n4. Supermercado\n5. Estudiantes\n Digite la opción: ");

        opcion = sc.nextByte();
        if (opcion == 1) {
            matriz = f.llenarMatriz();
        }else if (opcion == 2) {
            matrizL = f.llenarMatrizLibreria();
        }else if (opcion == 3) {
            matrizA = f.llenarMatrizAsientos();
        }else if (opcion == 4) {
            matrizSuper = f.llenarmatrizSuper();
        }else if (opcion == 5) {
            matrizE = f.llenarMatrizEstudiantes();
        }else if (opcion == 6) {
            
        }

        while (opcion != 0) {
            
            System.out.println("\n1. Encontrar producto en la matriz\n2. Mostrar productos de la matriz\n3. Inventario total\n4. Fusion Matrices\n5. Salir\n");
            System.out.print("Digite a qué opción quiere entrar: ");

  
            // Validacion
            // while (!sc.hasNextByte()) {
            //     System.out.println("Dato incorrecto" );
            //     System.out.print("Digite a qué opción quiere entrar: ");
            //     sc.next();
            // }
            opcion = sc.nextByte();

            switch (opcion) {
                case 1:
                    p2.encontrarProducto(matriz);
                    break;

                case 2:
                    p1.mostrarProductos(matriz);
                    break;

                case 3:
                    p3.libropreciomasAlto(matrizL);
                    break;
                    
                case 4:
                    
                    break;
                
                case 5:
                    System.out.println("Saliendo...");
                    break;

                case 6:
                    p4.ordenarAsientos(matrizA);
                    p4.mostrarAsientos(matrizA);
                    break;

                case 7:
                    p5.disponibilidadProducto(matrizSuper);
                    break;
                case 8:
                    p6.agruparEstudiantesCalificacion(matrizE);
                    break;
                case 9: 
                    p7.ordenarCategoria();
                    break;
                
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;
            }
        }
    }
}