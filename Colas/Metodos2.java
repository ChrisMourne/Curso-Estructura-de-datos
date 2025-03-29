
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Metodos2 {
    Scanner sc = new Scanner(System.in);

    public Queue<Computador> LlenarComputador(){
        Queue<Computador> cola = new LinkedList<>();
        System.out.print("Digite la cantidad de computadores que va a ingresar: ");
        int cantidad = sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            sc.nextLine();
            Computador c = new Computador();
            System.out.print("Digite el serial: ");
            c.setSerial(sc.nextLine());
            System.out.print("Digite la marca: ");
            c.setMarca(sc.nextLine());
            System.out.print("Digite el tamaño de la ram: ");
            c.setRam(sc.nextLine());
            System.out.print("Digite el tamaño del disco: ");
            c.setDisco(sc.nextLine());
            System.out.print("Digite el precio: ");
            c.setPrecio(sc.nextFloat());
            c.setDisponibilidad("Si");
            c.setNombre_estudiante("");
            c.setCarnet("");
            cola.add(c);
        }
        return cola;
    }

    public Queue<Tablet> LlenarTablet(){
        Queue<Tablet> cola = new LinkedList<>();
        System.out.print("Digite la cantidad de tablets que va ingresar: ");
        int cantidad = sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            Tablet c = new Tablet();
            sc.nextLine();
            System.out.print("Digite el serial: ");
            c.setSerial(sc.nextLine());
            System.out.print("Digite el tamaño: ");
            c.setTamaño(sc.nextLine());
            System.out.print("Digite la marca: ");
            c.setMarca(sc.nextLine());
            System.out.print("Digite el precio: ");
            c.setPrecio(sc.nextFloat());
            c.setDisponibilidad("Si");
            c.setNombre_estudiante("");
            c.setCarnet("");
            cola.add(c);
        }
        return cola;
    }

    public Queue<Computador> PrestarComputador(Queue<Computador> cola){
        System.out.print("¿Qué marca de computador se va prestar?: ");
        String marca = sc.nextLine();
        System.out.print("¿Cuanta memoria ram tiene el computador que se va a prestar?: ");
        String ram = sc.nextLine();

        for (Computador computador : cola) {
            if (computador.getMarca().equalsIgnoreCase(marca)) {
                if (computador.getRam().equals(ram)) {
                    System.out.print("Digite el nombre completo del estudiante que va a prestar el computador: ");
                    String nombre = sc.nextLine();
                    System.out.print("Digite el carnet: ");
                    String carnet = sc.nextLine();
                    computador.setNombre_estudiante(nombre);
                    computador.setCarnet(carnet);
                    computador.setDisponibilidad("No");
                    System.out.println("El computador ha sido prestado con éxito.");
                }else{
                    System.out.println("No hay un computador de esa marca con esa cantidad de ram en el inventario.");
                }
            }else{
                System.out.println("Esta marca no está en el inventario.");
            }
        }

        return cola;
    }

    public Queue<Tablet> PrestarTablet(Queue<Tablet> cola){
        System.out.print("¿Qué marca de tablet se va prestar?: ");
        String marca = sc.nextLine();
        System.out.print("¿Cuanta tamaño tiene la tablet que se va a prestar?: ");
        String tamaño = sc.nextLine();

        for (Tablet tablet : cola) {
            if (tablet.getMarca().equalsIgnoreCase(marca)) {
                if (tablet.getTamaño().equals(tamaño)) {
                    System.out.print("Digite el nombre completo del estudiante que va a prestar la tablet: ");
                    String nombre = sc.nextLine();
                    System.out.print("Digite el carnet: ");
                    String carnet = sc.nextLine();
                    tablet.setNombre_estudiante(nombre);
                    tablet.setCarnet(carnet);
                    tablet.setDisponibilidad("No");
                    System.out.println("El computador ha sido prestado con éxito.");
                }else{
                    System.out.println("No hay una tablet de esa marca con ese tamaño en el inventario.");
                }
            }else{
                System.out.println("Esta marca no está en el inventario.");
            }
        }

        return cola;
    }

    public Queue<Computador> DevolverComputador(Queue<Computador> cola){
        
        System.out.print("Digite el el carnet del estudiante: ");
        String carnet = sc.nextLine();

        for (Computador computador : cola) {
            if (computador.getCarnet().equalsIgnoreCase(carnet)) {
                computador.setCarnet("");
                computador.setNombre_estudiante("");
                computador.setDisponibilidad("Si");
                System.out.println("El computador ha sido devuelto con éxito.");
            }else{
                System.out.println("No hay ningun computador registrado con ese carnet.");
            }
        }
        return cola;
    }

    public Queue<Tablet> DevolverTablet(Queue<Tablet> cola){
        
        System.out.print("Digite el el carnet del estudiante: ");
        String carnet = sc.nextLine();

        for (Tablet tablet : cola) {
            if (tablet.getCarnet().equalsIgnoreCase(carnet)) {
                tablet.setCarnet("");
                tablet.setNombre_estudiante("");
                tablet.setDisponibilidad("Si");
                System.out.println("La tablet ha sido devuelta con éxito.");
            }else{
                System.out.println("No hay ninguna tablet registrado con ese carnet.");
            }
        }
        return cola;
    }

    public void Inventario(Queue<Computador> computador, Queue<Tablet> tablet){
        System.out.println("-----Inventario de Computadores-----");
        for (Computador c : computador) {
            System.out.println("Serial: "+c.getSerial());
            System.out.println("Marca: "+c.getMarca());
            System.out.println("Ram: "+c.getRam());
            System.out.println("Disco: "+c.getDisco());
            System.out.println("Precio: "+c.getPrecio());
            System.out.println("Nombre del estudiante que lo tiene prestado: "+c.getNombre_estudiante());
            System.out.println("Carnet del estudiante que lo tiene prestado: "+c.getCarnet());
            System.out.println("¿Disponible?: "+c.getDisponibilidad());
        }
        System.out.println("-----Inventario de Tablets-----");
        for (Tablet c : tablet) {
            System.out.println("Serial: "+c.getSerial());
            System.out.println("Tamaño: "+c.getTamaño());
            System.out.println("Marca: "+c.getMarca());
            System.out.println("Precio: "+c.getPrecio());
            System.out.println("Nombre del estudiante que lo tiene prestado: "+c.getNombre_estudiante());
            System.out.println("Carnet del estudiante que lo tiene prestado: "+c.getCarnet());
            System.out.println("¿Disponible?: "+c.getDisponibilidad());
        }
    }

    public void Menu(){
        Queue<Computador> computador = new LinkedList<>();
        Queue<Tablet> tablet = new LinkedList<>();

        System.out.println("-----MENU INVENTARIO-----");
        boolean bandera = true;

        while (bandera) {
            System.out.print("1. Agregar computador\n2. Agregar tablet\n3. Prestar computador\n4. Prestar tablet\n5. Devolver computador\n6. Devolver Tablet\n7. Mostrar Inventario\n8. Salir\n"
            + "Digite el numero de la opción que desea");
            int opt = sc.nextInt();

            while (!sc.hasNextInt()) {
                System.out.print("Entrada no válida, seleccione el número de la opción que desea: ");
                sc.next();
            }
            opt = sc.nextInt();

            if (opt < 1 || opt > 5) {
                System.out.println("Digite un número dentro del rango de opciones. ");
                continue;
            }

            switch (opt) {
                case 1:
                    computador = LlenarComputador();
                    break;
                case 2:
                    tablet = LlenarTablet();
                    break;
                case 3:
                    computador = PrestarComputador(computador);
                    break;
                case 4:
                    tablet = PrestarTablet(tablet);
                    break;
                case 5:
                    computador = DevolverComputador(computador);
                    break;
                case 6:
                    tablet = DevolverTablet(tablet);
                    break;
                case 7:
                    Inventario(computador, tablet);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    bandera = false;
                default:
                    break;
            }

        }
    }
}
