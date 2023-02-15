import java.util.Scanner;
import java.util.Locale;

public class usarLocale {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Es útil para leer y analizar la entrada de un usuario en el programa.
    scanner.useLocale(Locale.ENGLISH); // Establecemos la configuración regional en inglés. 
    // Lo hacemos para poder añadir números decimales con el punto en lugar de la coma (separar la parte entera del decimal).
    
    /*
    float numeroPrueba = scanner.nextFloat();
    System.out.println(numeroPrueba);
    */
    
  }
}
