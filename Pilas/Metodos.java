import java.util.Stack;
import javax.swing.JOptionPane;

public class Metodos {

    public Stack<Vehiculo> LlenarPila(){
        Stack<Vehiculo> pila = new Stack<Vehiculo>();
        boolean bandera = true;
        String opt;

        while (bandera == true) {
            Vehiculo v = new Vehiculo();
            v.setMarca(JOptionPane.showInputDialog("Ingrese la marca del vehiculo: "));
            v.setColor(JOptionPane.showInputDialog("Ingrese el color del vehiculo: "));
            v.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del vehiculo: ")));
            pila.push(v);
            opt = JOptionPane.showInputDialog("¿Desea ingresar otro vehiculo? (S/N): ");
            if (opt.equalsIgnoreCase("N")) {
                bandera = false;
            }
        }
        return pila;
    }

    public void mostrarPila(Stack<Vehiculo> pila){
        for (Vehiculo vehiculo : pila) {
            System.out.println(vehiculo.getMarca() + " " + vehiculo.getColor() + " " + vehiculo.getPrecio());
        }
    }

    public String EliminarPila(Stack<Vehiculo> pila){


        }
}

