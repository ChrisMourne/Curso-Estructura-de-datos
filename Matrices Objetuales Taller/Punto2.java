import java.util.Scanner;

public class Punto2 {

    Scanner sc = new Scanner(System.in);

    public void encontrarProducto(Producto[][] m){
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
}
