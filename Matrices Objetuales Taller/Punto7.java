import java.util.Scanner;

public class Punto7 {
    Scanner sc = new Scanner(System.in);
    public void ordenarCategoria(){
        // System.out.println("¿Cuántas categorías son?: ");
        // int c = sc.nextInt();

        ProductoAlmacen[] comida = new ProductoAlmacen[1];

        for (int i = 0; i < comida.length; i++) {
            ProductoAlmacen p = new ProductoAlmacen();
            System.out.print("Nombre producto: ");
            p.setNombre(sc.nextLine());
            p.setPeso((float)(Math.random()*10+1));
            System.out.print("Categoría: ");
            p.setCategoria(sc.nextLine());
            comida[i] = p;
        }

        ProductoAlmacen[] electro = new ProductoAlmacen[2];

        for (int i = 0; i < electro.length; i++) {
            ProductoAlmacen p = new ProductoAlmacen();
            System.out.print("Nombre producto: ");
            p.setNombre(sc.nextLine());
            p.setPeso((float)(Math.random()*10+1));
            System.out.print("Categoría: ");
            p.setCategoria(sc.nextLine());
            electro[i] = p;
        }

        ProductoAlmacen[] Camisas = new ProductoAlmacen[4];

        for (int i = 0; i < Camisas.length; i++) {
            ProductoAlmacen p = new ProductoAlmacen();
            System.out.print("Nombre producto: ");
            p.setNombre(sc.nextLine());
            p.setPeso((float)(Math.random()*10+1));
            System.out.print("Categoría: ");
            p.setCategoria(sc.nextLine());
            Camisas[i] = p;
        }


        ProductoAlmacen[][] m = new ProductoAlmacen[3][4];
        // Fila 0 - Comida
        for (int j = 0; j < comida.length; j++) {
            m[0][j] = comida[j];
        }

        // Fila 1 - Electrónicos
        for (int j = 0; j < electro.length; j++) {
            m[1][j] = electro[j];
        }

        // Fila 2 - Camisas
        for (int j = 0; j < Camisas.length; j++) {
            m[2][j] = Camisas[j];
        }

        for (int i = 0; i < m.length; i++) {
            System.out.print("Categoría " + (i+1) + ": ");
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] != null) {
                    System.out.print(m[i][j].getNombre() + " ");
                }
            }
            System.out.println();
        }
    }
}
