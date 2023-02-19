import java.util.Scanner;
public class EjemploWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("El bucle no se parará hasta que pongas el número: -1");
		System.out.print("Escribe un número: ");
		int numero = scanner.nextInt();
		while (numero != -1) {
			System.out.println("Has escrito el número: " + numero);
			numero = scanner.nextInt();
		}
		System.out.println("Has escrito el número -1 y el bucle WHILE ha parado");
	}
}
