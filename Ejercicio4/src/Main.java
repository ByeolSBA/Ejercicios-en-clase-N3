public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2},
                {3, 4}
        };
        int escalar = 10;
        System.out.print("El resultado de la multiplicacion por un escalar (" + 10 + " :es \n");
        resultado(matriz, escalar);
    }
        public static int resultado( int[][] matriz, int escalar){
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print((matriz[i][j] * 10)+ " ");
                }
                System.out.println();

            }
            return escalar;
        }
    }