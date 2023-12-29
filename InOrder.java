/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int min = 0;
		int num = 0;
		num = (int) (Math.random() * 11);
		do {
			System.out.print(num + " ");
			min = num;
			num = (int) (Math.random() * 11);
		} while (num >= min);
	}
}
