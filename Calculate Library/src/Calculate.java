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
	//average 2 inputs
	public static double average (double x, double y) {
		return ((x+y)/2);
	}
	//average 3 inputs
	public static double average (double x, double y, double z) {
		return ( x+y+z)/3;
	}
	//radians into degrees
	public static double toDegrees (double radians) {
		double pi =3.14159;
		return radians *((2*pi)/360);
	}
	//degrees into radians
	public static double toRadians (double degrees) {
		double pi=3.14159;
		return degrees *((2*pi)/360);
	}
	
	//this method uses 3 coefficients and returns the value of the discriminant
	public static double discriminant (double a, double b, double c) {
		return ((b*b)-4*a*c);
	}
	//this method accepts a three integer and returns a string
	public static String toImproperFrac (int x, int y, int z) {
		int numerator = x*y+z;
		int denominator = y;
		String improper;
		improper = numerator + "/" + denominator;
		return improper;
	}
	//this method accepts two integers and returns a string
	public static String toMixedNum (int top, int bottom) {
		int num = top/bottom;
		int numerator = top-num*bottom;
		int denominator = bottom;
		String mixedNum = num + "_" numerator + "/" + denominator;
		return mixedNum;
	}

	//this method converts a binomial multiplication into a quadratic equation
	public static String foil (int x, int y, int z, int m, int n) {
		int firstCoef = x*z;
			int secondCoef = x*m-y*z;
			int constantNum = y*m;
			String quadratic = firstCoef + n + "^2 + " +secondCoef + n + " +" + constantNum;
			return quadratic;
		}

	}
