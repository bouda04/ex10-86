import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter number of turns");
		int turns = in.nextInt();
		in.nextLine();
		if (turns > 0) {
			System.out.println("enter first sentence, start with the word 'start'");
			String sentence = in.nextLine();
			if (!firstWord(sentence).equals("start")) {
				System.out.println("ERROR");
				return;
			}
			for (int i = 1; i < turns; i++) {
				String last = lastWord(sentence);
				System.out.println("enter a new sentence, starting with " + last);
				sentence = in.nextLine();
				String first = firstWord(sentence);
				if (!first.equals(last)) {
					System.out.println("ERROR");
					return;
				}
			}
			System.out.println("GAME OVER!!!");
		}
		

	}
	
	private static String firstWord(String sentence) {
		int pos = sentence.indexOf(' ');
		if (pos == -1)
			return sentence;
		else
			return sentence.substring(0, pos);
	}
	
	private static String lastWord(String sentence) {
		int pos = sentence.lastIndexOf(' ');
		if (pos == -1)
			return sentence;
		else
			return sentence.substring(pos+1);
	}

}
