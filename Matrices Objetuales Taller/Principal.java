import java.util.Scanner;

public class Principal{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Metodos f = new Metodos();
        byte opcion;
        int d;
        d = f.dimension();
        Almacen[][] matriz = new Almacen[d][d];
        matriz = f.llenarMatriz(d);

        System.out.println("----- MENU PRINCIPAL -----");
        do {
            System.out.println("1. Encontrar producto en la matriz\n2. Mostrar productos de la matriz\n3. Inventario total\n 4. Salir");
            System.out.print("Digite a qué opción quiere entrar: ");
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
                    
                case 4:
                System.out.println("Saliendo...");
            
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;
            }
        } while (opcion != 4);
    }
}