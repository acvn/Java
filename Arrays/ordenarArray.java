import java.util.Scanner;
public class ordenarArray {
    public static void main(String[] args) {
        // Definimos el Scanner.
        Scanner scanner = new Scanner(System.in);

        // Creamos una variable para guardar la longitud del Array.
        System.out.print("¿Cuál es la longitud del array? ");

        int longitudArray = scanner.nextInt();
        // Es importante recordar que un array va de la posición 0 a la n-1 [0, n-1]


        // Definimos el array, en este caos llamado array con la longitud que nos dieron.
        int[] array = new int[longitudArray];

        System.out.println("Dime los valores que hay dentro del array: ");
        // Creamos un bucle para poder guardar los valores del array.
        // El bucle irá de 0 hasta la posición n-1.
        for (int i = 0 ; i < longitudArray ; i++) {
            array[i] = scanner.nextInt();
        }

        // Creamos una variable extra que la usaremos más adelante.
        int guardaValor;
        // Creamos un bucle para que recorra todas las posiciones del array.
        for (int i = 0 ; i < longitudArray ; i++) {
            // Creamos otro bucle para poder comparar las posiciones del array entre si.
            for (int j = i+1 ; j < longitudArray ; j++) {
                // Hacemos un condicional.
                if (array[i] > array[j]) {
                    // Usamos la variable creada anteriormente para guardar el valor de array[i].
                    guardaValor = array[i];
                    // Ahora modificamos el valor de array[i] a array[j].
                    // Si no hubiésemos guardado el valor de array[i] en una variable, se habría perdido.
                    array[i] = array[j];
                    // Ponemos el valor de array[i] (guardaValor) a array[j]
                    array[j] = guardaValor;
                    // Con esto se ordenaría el array.
                }
            }
        }

        // Para poder imprimir por pantalla el array de forma ordenada hacemos un bucle:
        for (int i = 0 ; i < longitudArray ; i++) {
            System.out.print(array[i] + " ");
        }




    }
}
