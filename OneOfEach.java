
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		Boolean b = true;
		Boolean g = true;
		int count = 0;
		while (g||b) {
			if (Math.random() < 0.5) {
				System.out.print("b ");
				b = false;
			} else {
				System.out.print("g ");
				g = false;
			}
			count++;
		}
		String statement = "You made it... and now you have " + count + " children.";
		System.out.println();
		System.out.println(statement);
	}
}
