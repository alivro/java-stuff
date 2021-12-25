import java.util.Arrays;


public class ReverseExample {

	public static void main(String[] args) {
		String number = new String ("123456789");
		StringBuilder numberReverse = new StringBuilder(number);
		numberReverse.reverse();

		System.out.println("Cadena original:");
		System.out.println(number);
		
		System.out.println("\nCadena invertida:");
		System.out.println(numberReverse.toString());
	}
}

