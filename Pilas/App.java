import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Metodos m = new Metodos();
        Stack<Vehiculo> pila = new Stack<>();
        pila = m.llenarPila();
        m.mostrarPila(pila);
        m.Crud(pila);
    }
}
