import java.util.Arrays;


public class SplitExample {

	public static void main(String[] args) {
		String golden = "1-6-1-8-0-3-3-9-8-8-7-4-9";
		String regex = new String("-");
		String[] digits = golden.split(regex);

		System.out.println("Cadena original:");
		System.out.println(golden);

		System.out.println("\nArreglo:");
		for(String digit : digits)
			System.out.print(digit + " ");

		System.out.println();
	}
}
