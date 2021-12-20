public class Burbuja {

    public static void main(String[] args) {
        int[][] arreglos = new int[3][];
        arreglos[0] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arreglos[1] = new int[]{2, 1, 4, 3, 6, 5, 8, 7, 10, 9};
        arreglos[2] = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for(int[] arreglo : arreglos) {
            System.out.println("Arreglo original:");
            for(int elemento : arreglo)
                System.out.print(elemento + " ");

            ordenamientoBurbuja(arreglo);

            System.out.println("\nArreglo ordenado:");
            for(int elemento : arreglo)
                System.out.print(elemento + " ");

            System.out.println("\n");          
        }
    }

    public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean ordenado = true;
        int i = 0;

        while(i < (n-1) && ordenado) {
            ordenado = false;

            for(int j = 0; j < (n-i-1); j++) {
                if (arreglo[j] > arreglo[j+1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;

                    ordenado = true;
                }           
            }
        }
    }
}