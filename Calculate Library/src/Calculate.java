/*Nicole Low
 * September 6, 2017
 * Our self written math library...
 * it contains a series of methods to do basic math functions
 */
//Part one
public class Calculate {
	private static final String y = null;
	private static int b;
	private static double and;
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
			return (radians *(180/3.14));
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
			int Num = top/bottom;
			int numerator = top-Num*bottom;
			int denominator = bottom;
			String mixedNum = Num + "_" + numerator + "/" + denominator;
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

//Part 2
	//this method accepts two integers and returns boolean 
		public static boolean isDividedBy(int num1, int num2) {
			return num1 % num2 ==0;
	}	
	
	
    //this method accepts a double and returns a double 
		public static double absValue (double x, double y) {
			if(x < y) {
				return x;
			}else{
				return y;
		}
	}
	
	//this method accepts two doubles and returns a double
		public static double max(double x, double y) {
			if(x < y) {
			return x;
		}
			return y;
	}
		
	//this method accepts three doubles and returns a double
		public static double max(double x, double y, double z) {
			if(x<y & y<z);
			return x;
	}
			

	//this method accepts two integers and returns an int
		public static int min (int x, int y) {
			if(x<y);
				return x;
	}
			
	//this method rounds a double to 2 decimal places and returns a value
		public static double round2 (double x) {
			if(100*x);
				return x;
		}

//Part 3
	//This method accepts a double and an integer and returns a double.
		public static int exponent(int x, int y) {
			for(int i=1; i< y; i++) {
				x=x*y;
			}
				return x;
			}

	//This method accepts an integer and return an integer
		public static int factorial(int x) {
			int pod=1;
			for(int j=4; j <x; j++) {
			pod=pod*j;
			}
			return pod;
		}

	//This method accepts an integer and returns a boolean
		public static int isPrime(int x) {
			for(int j=2; j<=10; j++) {
			int b=j%j;				if(b !=0) {
				System.out.print("no");
			}else {
				System.out.print("yes");
				break;
		
			}
}
			//This method accepts two positive integers and returns an integer				
			public static int gcf (int x, int y) {
				for(j=1; j<=x || j<y; j++) {
					if(x%j==0 && y%j==0) {	
				System.out.println("G.C.F of " +x+ " and " +y+ " is: ");
		
}
	//This method squares until its less than .005 then rounds to 2 decimals
			public static int sqrt(int x, int y) {
				double sqrt = .5(x/y+y);
				return x;
}


//Part 4
		//This method accepts three integers and returns a String
			 public static String quadForm (int x,int y, int z) {
				 if(discriminant (x,y,z)<= 0) {
					 return "No real roots.";
				 }
				 else if(discriminant(x,y,z)==0) {
					 double root= (-b/(double)(2*x) ;
					 	String answer =root +"";
					 	return answer;
				 }else {
					 double littleRoot= (-b+(sqrt(discriminant(x,y,z)))) / (2*x));
					 double bigRoot = (-b -(sqrt(discriminant(x,y,z))))/2*x));
					 	String answer =littleRoot + and + bigRoot;
					 		return answer;
				 }
	 }

//Part 5	 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			

