public class Punto4 {
    public void ordenarAsientos(Asiento[][] a){

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                for (int k = 0; k < a.length - j - 1; k++) {
                    if (a[i][k].getPrecio() > a[i][k + 1].getPrecio()) {
                        // Intercambiar directamente en la matriz
                        Asiento temp = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = temp;
                    }
                }
            }
        }
    }

    public void mostrarAsientos(Asiento[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("\nAsiento fila: "+m[i][j].getFila()+" | "+"Numero: "+m[i][j].getNumero()+" | "+"Precio: "+m[i][j].getPrecio()+"\n");
            }
        }
    }
}
