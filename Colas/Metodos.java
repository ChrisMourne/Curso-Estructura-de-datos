import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public void menu(){
        System.out.println("Bienvenidos");
        boolean bandera = true;
        while (bandera) {
            System.out.println("1. Hamburguesa\n2. Perro\n3. Salchipapa\n4. Pastel de pollo\n5. Salir");
            System.out.print("Seleccione el número de la opción que desea: ");
            int opt;
    
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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
