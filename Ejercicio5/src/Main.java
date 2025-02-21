public class Main {
    public static void main(String[] args) {
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                suma += matriz [i][j];
            }
        System.out.println(suma);
        }

    }
