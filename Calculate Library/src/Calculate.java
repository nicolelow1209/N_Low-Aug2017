/*Nicole Low
 * September 6, 2017
 * Our self written math library...
 * it contains a series of methods to do basic math functions
 */
public class Calculate {
	//square the input
	public static int square (int operand) {
		int squared =operand*operand;
		return squared;
	}
	//cube the input
	public static int cube (int operand) {
		int cubed =operand*operand*operand;
		return cubed;
	}
	//average the input
	//average double the input

	//convert input into degrees
	public static int toDegrees (double operand) {
		double degrees =180/3.1459* operand;
		return degrees;
	}
