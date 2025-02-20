import java.util.Scanner;

public class Principal{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Metodos f = new Metodos();
        byte opcion = 0;
        int d;
        d = f.dimension();
        Almacen[][] matriz = new Almacen[d][d];
        Libreria[][] matrizL = new Libreria[d][d];


        System.out.println("\n----- MENU PRINCIPAL -----");
        
        System.out.println("¿Qué ejercicio desea ver?");
        System.out.println("1. Almacen\n2. Libreria");
        if (opcion == 1) {
            matriz = f.llenarMatriz(d);
        }else if (opcion == 2) {
            matrizL = f.llenarMatrizLibreria(d);
        }

        while (opcion != 4) {
            
            System.out.println("\n1. Encontrar producto en la matriz\n2. Mostrar productos de la matriz\n3. Inventario total\n4. Salir\n");
            System.out.print("Digite a qué opción quiere entrar: ");
  
            // Validacion
            while (!sc.hasNextInt()) {
                System.out.println("Dato incorrecto" );
                System.out.print("Digite a qué opción quiere entrar: ");
                sc.next();
            }

            opcion = sc.nextByte();

            switch (opcion) {
                case 1:
                    f.encontrarProducto(matriz);
                    break;

                case 2:
                    f.mostrarMatriz(matriz);
                    break;

                case 3:
                    f.sumarCantidadProductos(matriz);
                    break;
                    
                case 4:
                    System.out.println("Saliendo...");
                    break;
            
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;
            }
        }
    }
}