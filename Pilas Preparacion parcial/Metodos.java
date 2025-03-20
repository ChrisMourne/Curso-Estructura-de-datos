import java.util.Scanner;
import java.util.Stack;
// HACER VALIDACIONES PARA METODO VENDER
public class Metodos{
    Scanner sc = new Scanner(System.in);

    public Stack<Shop> RegistrarPrenda(){
        sc.nextLine();
        Stack<Shop> pila = new Stack<>();
        boolean bandera = true;
        boolean validacion = true;

        while (bandera) {
            Shop s = new Shop();
            System.out.print("Ingrese la marca: ");
            String marca = sc.nextLine();
            System.out.print("Ingrese la referencia: ");
            String referencia = sc.nextLine();

            for (Shop prenda : pila) {
                if (prenda.getMarca().equalsIgnoreCase(marca)) {
                    System.out.print("La prenda ya existe ingrese la cantidad: ");
                    int cantidad = sc.nextInt();
                    prenda.setCantidad(prenda.getCantidad() + cantidad);
                    validacion = false;
                }
            }
            if (!validacion) {
                break;
            }else{
                System.out.print("Ingrese el precio: ");
                float precio = sc.nextFloat();
                System.out.print("Ingrese el stock de la prenda: ");
                int cantidad = sc.nextInt();
                s.setMarca(marca);
                s.setReferencia(referencia);
                s.setPrecio(precio);
                s.setCantidad(cantidad);
                pila.push(s);
                sc.nextLine();
                System.out.print("Desea ingresar una nueva prenda (S/N): ");
                String opcion = sc.nextLine();
                if (opcion.equalsIgnoreCase("N")) {
                    bandera = false;
                }
            }
        }
        return pila;
    }

    public void consultarPrenda(Stack<Shop> pila){
        sc.nextLine();
        System.out.print("Digite la marca de la prenda que desea buscar: ");
        String marca = sc.nextLine();
        boolean bandera = true;
        for (Shop prenda : pila) {

            if (prenda.getMarca().equalsIgnoreCase(marca)) {
                System.out.println("La marca "+prenda.getMarca()+" esta en el sistema");
                System.out.println("Su referencia es: "+prenda.getReferencia());
                System.out.println("Su precio es "+prenda.getPrecio());
                System.out.println("Su stock es "+prenda.getCantidad());
                bandera = true;
                break;
            }else{
                bandera = false;
            }
        }
        if (!bandera) {
            System.out.println("La marca no se encontró en el sistema.");
        }
    }

    public Stack<Shop> ModificarPrenda(Stack<Shop> pila){
        sc.nextLine();
        System.out.print("Digite la marca de la prenda que desea modificar: ");
        String marca = sc.nextLine();
        boolean bandera = true;
        for (Shop prenda : pila) {
            if (prenda.getMarca().equalsIgnoreCase(marca)) {
                System.out.print("¿Qué desea cambiar?\n1. Precio\n2. Cantidad\n3. Referencia\nDigite el numero de la opción que desea: ");
                byte opcion = sc.nextByte();
                bandera = true;
                if (opcion == 1) {
                    System.out.print("Digite el precio nuevo: ");
                    prenda.setPrecio(sc.nextFloat());
                    break;
                }else if (opcion == 2) {
                    System.out.print("Digite la cantidad de prendas que hay: ");
                    prenda.setCantidad(sc.nextInt());
                    break;
                }else if(opcion == 3){
                    System.out.print("Digite la nueva referencia: ");
                    prenda.setReferencia(sc.nextLine());
                    break;
                }else{
                    System.out.println("Ha digitado un número incorrecto.");
                    break;
                }
            }else{
                bandera = false;
            }
        }
        if (!bandera) {
            System.out.println("Ha digitado una marca que no esta en el sistema.");
        }
        return pila;
    }

    public Stack<Shop> VenderPrenda(Stack<Shop> pila){
        sc.nextLine();
        System.out.print("Digite la marca de la prenda que se va a vender: ");
        String marca = sc.nextLine();
        boolean bandera = true;
        for (Shop prenda : pila) {
            if (prenda.getMarca().equalsIgnoreCase(marca)) {
                System.out.print("¿Cuantas prendas de la marca "+marca+" va a vender?: ");
                int cantidad = sc.nextInt();
                prenda.setCantidad(prenda.getCantidad() - cantidad);
                System.out.println("La prenda se ha vendido correctamente.");
                bandera = true;
                break;
            }else{
                bandera = false;
            }
        }
        if (!bandera) {
            System.out.println("La marca de la prenda digitada no está en el sistema.");
        }
        return pila;
    }
    
    public Stack<Shop> ConsultarStock(Stack<Shop> pila){
        int sumaStock = 0;
        for (Shop prenda : pila) {
            sumaStock = prenda.getCantidad() + sumaStock;
        }
        System.out.println("El Stock total de la tienda es de "+sumaStock+" prendas");
        return pila;
    }

    public void menu(){
        System.out.println("--------MENU--------");
        boolean bandera = true;
        Stack<Shop> pila = new Stack<>();
        while (bandera) {
            System.out.print("Digite el número de la opcíón que desea ver\n1. Registrar Prenda\n2. Consultar prenda\n3. Modificar prenda\n4. Vender prenda\n5. Consultar stock\n6. Salir\nDigite el número de la opcion que desea ver: ");
            byte opcion = sc.nextByte();
            switch (opcion) {
                case 1:
                    pila = RegistrarPrenda();
                    break;
                case 2:
                    consultarPrenda(pila);
                    break;
                case 3:
                    pila = ModificarPrenda(pila);
                    break;
                case 4:
                    pila = VenderPrenda(pila);
                    break;
                case 5:
                    ConsultarStock(pila);
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