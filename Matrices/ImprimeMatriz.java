// Ejemplo simple de cómo solicitar al usuario los valores de una matriz y luego imprimir los valores de la matriz en la consola.
import java.util.Scanner; // Importamos el Scanner
public class ImprimeMatriz {
    public static void main(String[] args) {
        // Definimos el Scanner, le puse de nombre: scanner
        Scanner scanner = new Scanner(System.in);

        // Imprimimos por pantalla que queremos saber el número de filas de la matriz
        System.out.print("¿Cuántas filas tiene la matriz? ");

        // Creamos una variable para guardar el valor de las filas (cuántas filas habrá)
        int filas = scanner.nextInt();

        // Imprimimos por pantalla que queremos saber el número de columnas de la matriz
        System.out.print("¿Cuántas columnas tiene la matriz? ");
        // Creamos una variable para guardar el valor de las columnas (cuántas columnas habrá)
        int columnas = scanner.nextInt();

        // Creamos una matriz de enteros con el número de filas y columnas que nos dió el usuario
        int[][] matriz = new int[filas][columnas];

        // Le pedimos al usuario que nos dé los valores de la matriz.
        System.out.println("Dime los valores de la matriz: ");

        // Para eso debemos recorrer todas las posiciones de la matriz
        // Usamos dos bucles for
        for (int i = 0 ; i < filas ; i++) { // Recorre cada fila de la matriz
            for (int j = 0 ; j < columnas ; j++) { // Recorre cada columna de la matriz
                matriz[i][j] = scanner.nextInt(); // lee un entero y lo guarda en la posición correspondiente
            }
        }

        // Imprime por consola "Resultado"
        System.out.println("Resultado:");
        for (int i = 0 ; i < filas ; i++) { // Recorre cada fila de la matriz
            for (int j = 0 ; j < columnas ; j++) { // Recorre cada columna de la matriz
                System.out.print(matriz[i][j] + " "); // Imprime el valor actual de la matriz en esa posición
            }
            System.out.println(); // Imprime un salto de línea, así separamos las filas
        }


    }
}
