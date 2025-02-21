public class Main {
    public static void main(String[] args) {
                int[][] matriz1 = {
                        {1, 2},
                        {3, 4}
                };

                int[][] matriz2 = {
                        {5, 6},
                        {7, 8}
                };

                int[][] resultado = sumaMatriz(matriz1, matriz2);

                System.out.println("La suma de las matrices es:");
                for (int i = 0; i < resultado.length; i++) {
                    for (int j = 0; j < resultado[i].length; j++) {
                        System.out.print(resultado[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            public static int[][] sumaMatriz(int[][] matriz1, int[][] matriz2) {
                if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
                    throw new IllegalArgumentException("Las matrices deben ser de igual tamaño");
                }

                int filas = matriz1.length;
                int columnas = matriz1[0].length;
                int[][] resultado = new int[filas][columnas];

                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                    }
                }

                return resultado;
            }
        }


