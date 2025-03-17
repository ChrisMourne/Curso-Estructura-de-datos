import java.util.Stack;
public class Ppilas{
    public static void main(String[] args) {
        Metodos m = new Metodos();
        Stack<Vehiculo> pila = m.llenarPila();
        m.mostrarPila(pila);
    }
}