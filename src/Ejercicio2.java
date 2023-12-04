import java.util.Scanner;

public class Ejercicio2 {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String palabrasEjercicio1 = null;

		System.out.println("Escribe palabras del Ejercicio1: ");
		System.out.println("Si deseas finalizar pulsa 'ctrl+z' ");

		while (s.nextLine() != null) {
			String palabras = s.nextLine();
			System.out.println("resultado" + palabrasEjercicio1);
			
			for (String palabras) {
                System.out.println(Ejercicio1.sustituir(palabras));
			}
		}
	}

}
