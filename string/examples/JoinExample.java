public class JoinExample {
	public static void main(String[] args) {
		String words[] = {"My", "heart", "belongs", "to", "you"};
		String delimiter = new String(" ");
	    	String sentence = String.join(delimiter, words);
    
		System.out.println(sentence);
	}
}

