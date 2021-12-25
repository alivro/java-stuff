public class FormatExample {

	public static void main(String[] args) {
		FormatExample.example1();
		//FormatExample.example2();
		//FormatExample.example3();
	}

	public static void example1() {
		String entero = String.format("%d", 11037);  
		String flotante = String.format("%f %.10f", 3.141592653589793, 0.00002718281828459045);
		String notacionCientificaComputarizada = String.format("%e %E", 3.141592653589793, 0.00002718281828459045);
		String notacionCientificaGeneral = String.format("%g %G", 3.141592653589793, 0.00002718281828459045);

		System.out.println("Entero:");
		System.out.println(entero);

		System.out.println("\nFlotante:");
		System.out.println(flotante);

		System.out.println("\nNotacion Cientifica Computarizada:");
		System.out.println(notacionCientificaComputarizada);

		System.out.println("\nNotacion Cientifica General:");
		System.out.println(notacionCientificaGeneral);
	}

	public static void example2() {
		String boleano = String.format("%b %B", true, false);
		String caracter = String.format("%c %C ", 'a', 'z');
		String cadena = String.format("%s %S", "Madeline", "Badeline");
		
		System.out.println("Booleano:");
		System.out.println(boleano);

		System.out.println("\nCaracter:");
		System.out.println(caracter);

		System.out.println("\nCadena:");
		System.out.println(cadena);
	}

	public static void example3() {
		String indexOrdenado = String.format("%1$s %2$s %3$s %4$s %5$s", "a", "b", "c", "d", "e");
		String indexDesordenado = String.format("%5$s %4$s %3$s %2$s %1$s", "a", "b", "c", "d", "e");
		
		System.out.println("Indice de argumentos:");
		System.out.println(indexOrdenado);
		System.out.println(indexDesordenado);
	}
}
