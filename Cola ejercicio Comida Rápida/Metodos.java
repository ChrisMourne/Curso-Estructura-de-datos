import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    boolean bandera = true;
    int opt;
    String tipo = "";
    float precio = 0;
    public void Menu(Queue <Comida> cola){
        while (bandera) {
            System.out.println("-----Bienvenidos-----");
            System.out.print("1. Perro - 5$\n2. Hamburgesa - 10$\n3. Tacos - 15$\n4. Chorizo - 20$\n5. Salir\nElige una opción: ");
            while (!sc.hasNextInt()) {
                System.out.println("Debes ingresar un número de las opciones mostradas anteriormente: ");
                sc.next();
            }

            opt = sc.nextInt();
            if (opt < 1 || opt > 5) {
                System.out.print("Debes ingresar un número de las opciones mostradas anteriormente: ");
                continue;
            }

            switch (opt) {
                case 1:
                    tipo = "Perro";
                    precio = 5;
                    cola = HacerPedido(tipo, cola, precio);
                    break;
                case 2:
                    tipo = "Hamburgesa";
                    precio = 10;
                    cola = HacerPedido(tipo, cola, precio);
                    break;
                case 3:
                    tipo = "Tacos";
                    precio = 15;
                    cola = HacerPedido(tipo, cola, precio);
                    break;
                case 4:
                    tipo = "Chorizo";
                    precio = 20;
                    cola = HacerPedido(tipo, cola, precio);
                    break;
                case 5:
                    MenuEmpresa(cola);
                    break;
                default:
                    break;
            }
        }
    }
    public Queue<Comida> HacerPedido(String comida, Queue<Comida> cola, float precio){ 
        Comida c = new Comida();
        c.setTipoComida(comida);
        System.out.print("Digite la cantidad: ");
        while (!sc.hasNextInt()) {
            System.out.println("Debes ingresar un número válido: ");
            sc.next();
        }
        int cantidad = sc.nextInt();
        c.setCantidad(cantidad);
        c.setPrecio(precio * cantidad);
        System.out.print("Digite el nombre del cliente: ");
        c.setNombreCliente(sc.next());
        cola.add(c);
        return cola;
    }

    public void mostrarTurno(Queue<Comida> cola){
        System.out.println("-----Turno-----");
        System.out.println("Tipo: " + cola.peek().getTipoComida());
        System.out.println("Cantidad: " + cola.peek().getCantidad());
        System.out.println("Precio: " + cola.peek().getPrecio());
        System.out.println("Cliente: " + cola.peek().getNombreCliente());

    }

    public Queue<Comida> Despachar(Queue<Comida> cola){
        if(cola.isEmpty()) {
            System.out.println("No hay pedidos en la cola.");
            return cola;
        }else{
            cola.remove();
            return cola;
        }

    }

    public Queue<Comida> MenuEmpresa(Queue <Comida> cola){
        while (bandera) {
            System.out.print("1. Ingresar pedido\n2. Visualizar turno\n3. Despachar\n4. Salir\nElige una opción: ");
        while (!sc.hasNextInt()) {
            System.out.println("Debes ingresar un número de las opciones mostradas anteriormente: ");
            sc.next();
            }
        
        opt = sc.nextInt();
        if (opt < 1 || opt > 5) {
            System.out.print("Debes ingresar un número de las opciones mostradas anteriormente: ");
            continue;
            }
        
        switch (opt) {
            case 1:
                Menu(cola);
                break;
            case 2:
                mostrarTurno(cola);
                break;
            case 3:
                cola = Despachar(cola);
                break;
            case 4:
                bandera = false;
                break;
            default:
                break;
        }
        }
    return cola;
    }
}
    


   

