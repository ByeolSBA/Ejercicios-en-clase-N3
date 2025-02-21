public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] resultado = transponerMatriz(matriz);

        System.out.println("La matriz transpuesta es:");
        for (int[] ints : resultado) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
            }

            public static int[][] transponerMatriz(int[][] matriz) {
                int filas = matriz.length;
                int columnas = matriz[0].length;

                int[][] transpuesta = new int[columnas][filas];

                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        transpuesta[j][i] = matriz[i][j];
                    }
                }

                return transpuesta;
            }
        }

