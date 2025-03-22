import java.util.Scanner;
import java.util.Stack;

public class Funciones {
    Scanner sc = new Scanner(System.in);
    //ingrese, Tienda consulte, modifique, elimine, venda, tenga menu
     
    public Stack<Shop> ingresarProducto(Stack<Shop> producto){
        
        boolean bandera = true;
        String opt;
        sc.nextLine();
        while (bandera) {
  
            Shop s = new Shop();
            System.out.print("Digite la marca del producto: ");
            String marca = sc.nextLine();
            System.out.print("Digite la referencia del producto: ");
            String referencia = sc.nextLine();
            if (existeProducto(producto, marca) || existeProducto(producto, referencia)) {
                for (Shop p : producto) {
                    if (p.getMarca().equalsIgnoreCase(marca) || p.getReferencia().equalsIgnoreCase(referencia)) {
                        System.out.print("La referencia o marca del producto ya existe, tiene la marca "+p.getMarca()+" y la referencia "+p.getReferencia()+"\nDigite la cantidad que le va a agregar a este producto: ");
                        int cantidad = sc.nextInt();
                        p.setCantidad(p.getCantidad() + cantidad);
                        bandera = false;
                    }
                }
                break;
            }else{
                s.setMarca(marca);
                s.setReferencia(referencia);
                System.out.print("Digite el precio del producto: ");
                s.setPrecio(sc.nextFloat());
                System.out.print("Digite el Stock que tiene el producto: ");
                s.setCantidad(sc.nextInt());

                producto.push(s);
                sc.nextLine();
                System.out.print("¿Desea seguir ingresando productos? (S/N): ");
                opt = sc.nextLine();
                if (opt.equalsIgnoreCase("n")) {
                    break;
                }else if (opt.equalsIgnoreCase("s")) {
                    
                }else{
                    System.out.println("Digite un valor válido (S/N).");
                }
            }
        }
        return producto;
    }


    public boolean existeProducto(Stack<Shop> producto, String marca){
        boolean pExiste = false;
            for (Shop p : producto) {
                if (p.getMarca().equalsIgnoreCase(marca) || p.getReferencia().equalsIgnoreCase(marca)) {
                    pExiste = true;
                    break;
                }else{
                    pExiste = false;
                }
            }
        return pExiste;
    }

    public void consultarProducto(Stack<Shop> producto){
        sc.nextLine();
        System.out.print("Digite la marca o referencia del producto que desea consultar: ");
        String marca = sc.nextLine();
        if (!existeProducto(producto, marca)) {
            System.out.println("\nLa marca o referencia ingresada no existe en el sistema.\n");
        }else{
            for (Shop p : producto) {
                if (p.getMarca().equalsIgnoreCase(marca) || p.getReferencia().equalsIgnoreCase(marca)) {
                    System.out.println("\nMarca: "+p.getMarca());
                    System.out.println("Referencia: "+p.getReferencia());
                    System.out.println("Precio: "+p.getPrecio());
                    System.out.println("Stock: "+p.getCantidad()+"\n");
                }
            }
        }
        
    }

    public Stack<Shop> modificarProducto(Stack<Shop> producto){
        sc.nextLine();
        int opt;
        System.out.print("Digite la marca o referencia del producto que desea modificar: ");
        String marca = sc.nextLine();

        if (!existeProducto(producto, marca)) {
            System.out.println("\nLa marca o referencia ingresada no existe en el sistema.\n");
        }else{
            for (Shop p : producto) {
                if (p.getMarca().equalsIgnoreCase(marca) || p.getReferencia().equals(marca)) {
                    System.out.print("¿Qué desea modificar?\n1. Precio\n2. Stock\nDigite el numero de la opción que desea: ");
                    opt = sc.nextInt();
                    if (opt == 1) {
                        System.out.print("Digite el nuevo precio que va tener: ");
                        p.setPrecio(sc.nextFloat());
                        System.out.println("\nSe ha modificado correctamente.\n");
                    }else if (opt == 2) {
                        System.out.print("Digite el nuevo Stock que va tener: ");
                        p.setCantidad(sc.nextInt());
                        System.out.println("\nSe ha modificado correctamente.\n");
                    }
                }
                
            }
        }
        return producto;
    }

    public Stack<Shop> eliminarProducto(Stack<Shop> producto){
            sc.nextLine();
            System.out.print("Digite la marca o referencia del producto que desea eliminar: ");
            String marca = sc.nextLine();

            if (!existeProducto(producto, marca)) {
                System.out.println("\nLa marca o referencia ingresada no existe en el sistema.\n");
            }else{
                for (Shop p : producto) {
                    if (p.getMarca().equalsIgnoreCase(marca) || p.getReferencia().equalsIgnoreCase(marca)) {
                        producto.remove(p);
                    }
                }
            }
        return producto;
    }

    public Stack<Shop> venderProducto(Stack<Shop> producto){
        sc.nextLine();
        int cantidad;
        System.out.print("Digite la marca del producto que desea vender: ");
        String marca = sc.nextLine();

        if (!existeProducto(producto, marca)) {
            System.out.println("La marca ingresada no existe en el sistema.");
        }else{
            for (Shop p : producto) {
                if (p.getMarca().equalsIgnoreCase(marca) || p.getReferencia().equalsIgnoreCase(marca)) {
                    System.out.print("¿Cuantos productos se van a vender?: ");
                    cantidad = sc.nextInt();
                    p.setCantidad(p.getCantidad() - cantidad);
                    System.out.println("\nSe ha vendido correctamente.\n");
                }
            }
        }
        return producto;
    }
    //ingrese, Tienda consulte, modifique, elimine, venda, tenga menu
    public void menu(){

        Stack <Shop> p = new Stack<>();
        System.out.println("------MENU------\n");
        boolean bandera = true;
        while (bandera) {
            System.out.print("1. Ingresar productos\n2. Consultar producto\n3. Modificar producto\n4. Vender producto\n5. Eliminar producto\n6. Salir\nDigite el número de la acción que desea realizar: ");
            byte opt = sc.nextByte();
            switch (opt) {
                case 1:
                    p = ingresarProducto(p);
                    break;
                case 2:
                    consultarProducto(p);
                    break;
                case 3:
                    modificarProducto(p);
                    break;
                case 4:
                    venderProducto(p);
                    break;
                case 5:
                    eliminarProducto(p);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    bandera = false;
                    break;
                default:
                    break;
            }
        }
    }
}

    
