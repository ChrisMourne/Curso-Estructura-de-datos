import java.util.Scanner;
import java.util.Stack;

public class MetodosR {
    Scanner sc = new Scanner(System.in);

    public Stack<Repuesto> llenarRepuesto() {
        sc.nextLine();
        Stack<Repuesto> r = new Stack<Repuesto>();
        boolean bandera = true;
        String opt;
        while (bandera) {
            System.out.print("Ingrese la marca del repuesto: ");
            String marca = sc.nextLine();
            System.out.print("Ingrese la referencia del repuesto: ");
            String referencia = sc.nextLine();
            int cantidad = ((int) (Math.random()*4)+1);
            float precio = ((float) (Math.random()*50)+1);
            r.push(new Repuesto(cantidad, marca, precio, referencia));
            System.out.print("Desea ingresar otro repuesto? S/N: ");
            opt = sc.nextLine();
            if (opt.equalsIgnoreCase("N")) {
                bandera = false;
            }
        }
        return r;
    }

    public void mostrarRepuesto(Stack<Repuesto> r) {
        for (Repuesto repuesto : r) {
            System.out.println("Marca: "+repuesto.getMarca());
            System.out.println("Referencia: "+repuesto.getReferencia());
            System.out.println("Cantidad: "+repuesto.getCantidad());
            System.out.println("Precio: "+repuesto.getPrecio());
        }
    }

    public void buscarRepuesto(Stack<Repuesto> r) {
        sc.nextLine();
        System.out.print("Digite la marca del repuesto que desea buscar: ");
        String busqueda = sc.nextLine();
        for (Repuesto repuesto : r) {
            if (repuesto.getMarca().equalsIgnoreCase(busqueda)){
                System.out.println("La marca "+repuesto.getMarca()+" se encuentra en la base de datos");
                System.out.println("Referencia: "+repuesto.getReferencia());
                System.out.println("Cantidad: "+repuesto.getCantidad());
                System.out.println("Precio: "+repuesto.getPrecio());
            }
        }
    }

    public Stack<Repuesto> eliminarRepuesto(Stack<Repuesto> r) {
        sc.nextLine();
        System.out.print("Digite la marca del repuesto que desea eliminar: ");
        String busqueda = sc.nextLine();
        for (Repuesto repuesto : r) {
            if (repuesto.getMarca().equalsIgnoreCase(busqueda)){
                r.remove(repuesto);
                break;
            }
        }
        return r;
    }

    public Stack<Repuesto> modificarRepuesto(Stack<Repuesto> r) {
        sc.nextLine();
        System.out.print("Digite la marca del repuesto que desea modificar: ");
        String busqueda = sc.nextLine();
        System.out.print("¿Que desea modificar? 1. Referencia, 2. Cantidad, 3. Precio\nDigite la opción: ");
        int opt = sc.nextInt();
        for (Repuesto repuesto : r) {
            if (repuesto.getMarca().equalsIgnoreCase(busqueda)){
                switch (opt) {
                    case 1:
                        System.out.print("Digite la nueva referencia: ");
                        repuesto.setReferencia(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("Digite la nueva cantidad: ");
                        repuesto.setCantidad(sc.nextInt());
                        break;
                    case 3:
                        System.out.print("Digite el nuevo precio: ");
                        repuesto.setPrecio(sc.nextFloat());
                        break;
                    default:
                        break;
                }
            }
        }
        return r;
    }

    public Stack<Repuesto> venderRepuesto(Stack<Repuesto> r) {
        sc.nextLine();
        System.out.print("Digite la marca del repuesto que desea vender: ");
        String busqueda = sc.nextLine();
        for (Repuesto repuesto : r) {
            if (repuesto.getMarca().equalsIgnoreCase(busqueda)){
                if (repuesto.getCantidad() < 1) {
                    System.out.println("No hay Stock disponible");
                    break;
                } else {
                    System.out.print("¿Cuántos repuestos va vender?: ");
                    int cantidad;
                    cantidad = sc.nextInt();
                    if (repuesto.getCantidad() < cantidad) {
                        System.out.println("No hay Stock suficiente");
                        break;
                    } else {
                        repuesto.setCantidad(repuesto.getCantidad() - cantidad);
                        System.out.println("Has vendido 3 repuestos de la marca "+repuesto.getMarca());
                    }
                }
            }
        }
        return r;
    }

    public void menu() {

        boolean bandera = true;
        Stack<Repuesto> r = new Stack<>();
        System.out.println("----------MENU----------");
        while (bandera) {

            System.out.print("1. Llenar base de datos repuesto\n2. Buscar repuesto\n3. Modificar repuesto\n4. Eliminar repuesto\n5. Vender repuesto\n6. Salir del menú\nDigite la opción que desea: ");
            Byte opt = sc.nextByte();
            switch (opt) {
                case 1:
                    r = llenarRepuesto();
                    break;
                case 2:
                    buscarRepuesto(r);
                    break;
                case 3:
                    modificarRepuesto(r);
                    break;
                case 4:
                    eliminarRepuesto(r);
                    break;
                case 5:
                    venderRepuesto(r);
                    break;
                case 6:
                    bandera = false;
                    System.out.println("Saliendo...");
                    break;
            
                default:
                    break;
            }
        }

    }
}
