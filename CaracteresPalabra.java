import java.util.Scanner;
public class CaracteresPalabra {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Pedimos al usuario escribir una palabra.
    System.out.print("Escríbe una palabra: ");
    // Usamos la clase Scanner para leer una entrada de texto del usuario y la guardamos en la variable "palabra".
    String palabra = scanner.next();
    // Utilizando el método "length" de la clase String podemos contar el número de caracteres de la palabra.
    int totalCaracteres = palabra.length();
    // Imprimimos el número total de caracteres.
    System.out.println(palabra + " tiene " + totalCaracteres + " caracteres.");
  }
}
