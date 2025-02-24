import java.util.Scanner;

// Tienes dos matrices de objetos Producto, una para cada tienda, con atributos nombre, precio, stock. 
// Escribe un algoritmo que fusione ambas matrices sumando el stock de los productos idénticos. Los productos que no son idénticos 
// los debe agregar en la matriz resultante 

//Debo sumar el stock si los productos son identicos, y añadirlos a la nueva matriz resultante, además los que no son idénticos debo también agregarlos
public class Principal{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Metodos f = new Metodos();
        byte opcion = 0;
        int d;

        Almacen[][] matriz = new Almacen[0][0];
        Libreria[][] matrizL = new Libreria[0][0];


        System.out.println("\n----- MENU PRINCIPAL -----");
        
        System.out.println("¿Qué ejercicio desea ver?");
        System.out.print("1. Almacen\n2. Libreria\nDigite la opción: ");
        opcion = sc.nextByte();
        if (opcion == 1) {
            d = f.dimension();
            matriz = f.llenarMatriz();
        }else if (opcion == 2) {
            d = f.dimension();
            matrizL = f.llenarMatrizLibreria(d);
        }

        while (opcion != 4) {
            
            System.out.println("\n1. Encontrar producto en la matriz\n2. Mostrar productos de la matriz\n3. Inventario total\n4. Fusion Matrices\n5. Salir\n");
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
                    f.fusionMatrices();
                    break;
                
                case 5:
                    System.out.println("Saliendo...");
                    break;
        
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;
            }
        }
    }
}