import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Stack <Vehiculo> llenarPila(){

        Stack<Vehiculo> pila = new Stack<>();

        boolean bandera = true;
        String opt = "";
        while (bandera) {
            Vehiculo v = new Vehiculo();

            System.out.print("Digite la marca: ");
            v.setMarca(sc.nextLine());
            System.out.print("Digite el color: ");
            v.setColor(sc.nextLine());
            System.out.print("Digite el precio: ");
            v.setPrecio(sc.nextDouble());
            sc.nextLine();
            pila.push(v);
            System.out.print("¿Desea ingresar otro vehículo? (S/N): ");
            opt = sc.nextLine();
            if (opt.equalsIgnoreCase("N")) {
                bandera = false;
            }
        }
        return pila;
    }

    public void mostrarPila(Stack <Vehiculo> pila){
        for (Vehiculo vehiculo : pila) {
            System.out.println("Marca: "+vehiculo.getMarca());
            System.out.println("Color: "+vehiculo.getColor());
            System.out.println("Precio: "+vehiculo.getPrecio());
            System.out.println();
        }
    }

    public void Crud(Stack<Vehiculo> pila){
        String dato;
        int opt;
        boolean bandera = true;
        
        while (bandera) {
            System.out.print("Digite el registro al que desea realizar una acción: ");
            dato = sc.nextLine();
            System.out.println("¿Qué desea hacer?\n1. Eliminar\n2. Modificar\n3. Mostrar \n4. Salir");
            opt = sc.nextInt();
    
    
            switch (opt) {
                case 1:
                    for (Vehiculo vehiculo : pila) {
                        if (vehiculo.getMarca().equalsIgnoreCase(dato)) {
                            pila.remove(vehiculo);
                            System.out.println("Regiistro eliminado");
                        }
                    }
                    break;
                case 2:
                    for (Vehiculo vehiculo : pila) {
                        if (vehiculo.getMarca().equalsIgnoreCase(dato)) {
                            System.out.print("Ingrese la marca: ");
                            dato = sc.nextLine();
                            System.out.print("Qué desea cambiar del vehiculo\n1. Color\n2. Precio");
                            int marcaopt = sc.nextInt();
                            if (marcaopt == 1) {
                                System.out.print("Digite el color:");
                                vehiculo.setColor(sc.nextLine());
                            }else if (marcaopt == 2) {
                                System.out.print("Digite el precio: ");
                                vehiculo.setPrecio(sc.nextDouble());
                            }
                        }
                    }
                    break;
                case 3:
                    mostrarPila(pila);
                
                case 4:
                    bandera = false;
                    break;
    
                default:
                    break;
            }
        }

    }
}
