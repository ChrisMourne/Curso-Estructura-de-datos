public class Punto6 {
    public void agruparEstudiantesCalificacion(Estudiante[][] m){
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;


        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getCalificacion().equals("A")) {
                    c1 = c1+1;
                }else if (m[i][j].getCalificacion().equals("B")) {
                    c2 = c2+1;
                }else if (m[i][j].getCalificacion().equals("C")) {
                    c3 = c3+1;
                }
            }
        }

        Estudiante[][] m1 = new Estudiante[c1][1];
        Estudiante[][] m2 = new Estudiante[c2][1];
        Estudiante[][] m3 = new Estudiante[c3][1];

        c1 = 0;  c2 = 0; c3 = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                if (m[i][j].getCalificacion().equals("A")) {
                    m1[c1][0] = m[i][j];
                    c1 = c1+1;
                }else if (m[i][j].getCalificacion().equals("B")) {
                    m2[c2][0] = m[i][j];
                    c2 = c2+1;
                }else if (m[i][j].getCalificacion().equals("C")) {
                    m3[c3][0] = m[i][j];
                    c3 = c3+1;
                }
            }
        }

        System.out.println("Estudiantes que sacaron A");
        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println("Nombre: "+m1[i][j].getNombre()+" Calificación: "+m1[i][j].getCalificacion());
            }
        }
        System.out.println("Estudiantes que sacaron B");
        for (int i = 0; i < c2; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println("Nombre: "+m2[i][j].getNombre()+" Calificación: "+m2[i][j].getCalificacion());
            }
        }
        System.out.println("Estudiantes que sacaron C");
        for (int i = 0; i < c3; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println("Nombre: "+m3[i][j].getNombre()+" Calificación: "+m3[i][j].getCalificacion());
            }
        }
    }
}
