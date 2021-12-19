public class SplitExample {

	public static void main(String[] args) {
		String pi = "3-1-4-1-5-9";
		String regex = new String("-");
		String[] digits = pi.split(regex);

		for(String digit: digits)
			System.out.println(digit);
	}

}
