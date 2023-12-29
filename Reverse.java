/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str = args[0];
		int n = str.length();
		for (int i = (n - 1); i > 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println(str.charAt(0));
		char mid = str.charAt(((n + 1) / 2) - 1);
		System.out.println("The middle character is " + mid);
	}
}
