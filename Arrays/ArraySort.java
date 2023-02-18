import java.util.Scanner;
import java.util.Arrays;
public class ArraySort {
    public static void main(String[] args) {
        // Definimos el Scanner.
        Scanner scanner = new Scanner(System.in);

        // Creamos una variable para guardar la longitud del Array.
        System.out.print("¿Cuál es la longitud del array? ");

        int longitudArray = scanner.nextInt();
        // Es importante recordar que un array va de la posición 0 a la n-1 [0, n-1]


        // Definimos el array, en este caso llamado array con la longitud que nos dieron.
        int[] array = new int[longitudArray];

        System.out.println("Dime los valores que hay dentro del array: ");
        // Creamos un bucle para poder guardar los valores del array.
        // El bucle irá de 0 hasta la posición n-1.
        for (int i = 0 ; i < longitudArray ; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        // Imprimimos el resultado con un bucle.
        for (int i = 0 ; i < longitudArray ; i++) {
            System.out.print(array[i] + " ");
        }
      
    }
}
