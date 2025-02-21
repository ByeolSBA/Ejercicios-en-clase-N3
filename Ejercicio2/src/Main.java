public class Main {
    public static void main(String[] args) {
        int [][] matriza = {
                {1,2},
                {3,4}
        };

        int filas = matriza.length;
        int columnas = matriza[0].length;
        int [][] resultado = new int[filas][columnas];
        int [][] matrizb = {
                {1,2},
                {3,4}
        };
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j <columnas ; j++) {
                resultado[i][j] = matriza[i][j] + matrizb[i][j];
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}