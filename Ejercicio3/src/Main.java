public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {15, 2, 3},
                {4, 12, 26},
                {7, 8, 19}
        };
        int maximo = encontrarMaximo(matriz);
        System.out.println("El maximo de la matriz es: " + maximo);
    }
    public static int encontrarMaximo(int[][] matriz) {
        int max = Integer.MIN_VALUE;
           for (int[]fila : matriz) {
               for (int valor : fila) {
                 if (valor > max ) {
                  max = valor;
                    }
                }

           }
           return max;
        }
}