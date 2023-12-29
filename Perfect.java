/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum = 1;
		String statement = n + " is a perfect number since " + n + " = 1";
		for (int d = 2; d <= (n / 2); d++) {
			if (n % d == 0) {
				statement += " + " + d;
				sum += d;
			}
		}
		System.out.println(sum == n ? statement : n + " is not a perfect number");
	}
}
