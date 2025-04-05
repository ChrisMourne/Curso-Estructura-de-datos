import java.util.LinkedList;
import java.util.Queue;

public class Principal {
    public static void main(String[] args) {
        Queue <Comida> cola = new LinkedList<Comida>();
        Metodos m = new Metodos();
        m.MenuEmpresa(cola);
        
    }
}