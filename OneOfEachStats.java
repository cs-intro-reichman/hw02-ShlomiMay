import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		
		double total = 0;
		int two = 0;
		int three = 0;
		int more = 0;
		for (int tests = 1; tests <= T; tests++) {
			int count = 0;
			Boolean b = true;
			Boolean g = true;
			while (g||b) {
				double rnd = generator.nextDouble();
				if (rnd < 0.5) {
					b = false;
				} else {
					g = false;
				}
				count++;
			}
			switch (count) {
				case 2:
					two++;
					break;
				case 3:
					three++;
					break;
				default:
					more++;
			}
			total += count;
		}
		double average = total / T;
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + two);
		System.out.println("Number of families with 3 children: " + three);
		System.out.println("Number of families with 4 or more children: " + more);
		System.out.print("The most common number of children is ");
		if (two >= three && two >= more) {
			System.out.println("2.");
		} else if (three >= more) {
			System.out.println("3.");
		} else {
			System.out.println("4 or more.");
		}
	}
}
