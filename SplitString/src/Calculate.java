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
	

	//This method takes an integer and return its square.
	public static int square(int number) {
		return number * number;
	}


	//This method takes an integer and return its cube.
	public static int cube(int number) {
		return number * number * number;
	}
	
	//This method takes 2 numbers and return their average.
	public static double average(double num1, double num2) {
		return (num1 + num2)/2;
	}


	//This method takes 3 numbers and return their average.
	public static double average(double num1, double num2, double num3) {
		return (num1 + num2 + num3)/3;
	}

	//This method changes radians into degrees
		public static double toDegrees (double radians) {
			double pi =3.14159;
			return (radians *(180/3.14));
	}

	//This method changes degrees into radians
		public static double toRadians (double degrees) {
			double pi=3.14159;
			return degrees *((2*pi)/360);
	}
	
	//This method takes 3 coefficients and return the value of the discriminant.
		public static double discriminant(double coef1, double coef2, double coef3) {
			return (coef2 * coef2) - 4 * coef1 * coef3;
	}

	//This method accepts a three integer and returns a string
		public static String toImproperFrac (int x, int y, int z) {
			int numerator = x*y+z;
			int denominator = y;
			String improper;
			improper = numerator + "/" + denominator;
			return improper;
	}

	//This method takes two integers from a fraction and return a string where it shows an improper fraction. 
		public static String toMixedNum(int top, int bottom){
			int wholeNumber = top / bottom;
			int numerator = top - wholeNumber * bottom;
			int denominator = bottom;
			String mixedNum = wholeNumber + "_" + numerator + "/" + denominator; 
			return mixedNum;
				}

	//This method converts a binomial multiplication into a quadratic equation
		public static String foil (int x, int y, int z, int m, int n) {
			int firstCoef = x*z;
			int secondCoef = x*m-y*z;
			int constantNum = y*m;
			String quadratic = firstCoef + n + "^2 + " +secondCoef + n + " +" + constantNum;
			return quadratic;
	}

//Part 2
	
	//This method takes 2 integers and return a boolean that determines whether or not one integer is evenly divisible by another.
		public static boolean isDivisibleBy(int num1, int num2) {
			if (num2 == 0) {
				throw new IllegalArgumentException("The denominator cannot be equal to 0");
			}
			if (num1 % num2 == 0) {
				return true;
			}else {
				return false;
			}
		}
	
	//This method takes a double and return its absolute value
		public static double absValue(double num) {
			if(num > 0) {
				return num;
			}else if(num == 0) {
				return 0;
			}else {
				return -1 * num;
			}
		}
	
	//This method takes 2 double and return the bigger value.
		public static double max(double num1, double num2) {
			if (num1 > num2) {
				return num1;
			}else {
				return num2;
			}
		}
		
	//This method accepts three doubles and returns a double
		public static double max(double x, double y, double z) {
			if(x<y & y<z);
			return x;
	}
			
	//This method takes 2 integers and return the smaller number.
		public static int min(int num1, int num2) {
			if (num1 > num2) {
				return num2;
			}else {
				return num1;
			}
		}
			

	//This method takes a double and return a double with 2 decimal places. 
		public static double round2(double num) {
			double remainder = num * 1000 % 10;
			if(num < 0) {
				num *= -1;
				if (remainder < 5) {
					num = (num * 1000 - num * 1000 % 10) / 1000;
				}else {
					num = (10 - num * 1000 % 10 + num * 1000) / 1000;
				}
				num *= -1;
				return num;
			}else {
				if(remainder < 5) {
					return (num * 1000 - num * 1000 % 10) / 1000;
				}else {
					return (10 - num * 1000 % 10 + num * 1000) / 1000;
				}
			}
		}

//Part 3
	
	//This method takes a double and an integer and returns a double the integer is the exponent of that double.
		public static double exponent(double num1, int num2) {
		double initialA = num1;
		if (num2 > 0) {
			for(int i = 1; i <= num2 - 1; i++) {
		}
				num1 *= initialA;
			
		}else if(num2 == 0){
				return 1.0;
			}else if(num2 < 0) {
				throw new IllegalArgumentException("Number cannot be less than 0");
			}
			return num1;
		}
		
	//This method accepts an integer and returns the factorial of the value passed.
		public static int factorial(int num) {
			int base = num;
			if(num < 0) {
				throw new IllegalArgumentException("Number cannot be less than 0");
				}else if(num == 0) {
					return 1;
				}else if(num > 0) {
					for(int i = num; i >= 1; i--) {
						num *= i;
				}
			}	
				return num/base;
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
		}
	//This method accepts two positive integers and returns an integer				
		public static int gcf(int num1, int num2) {
			int originalNum1 = num1;
			int originalNum2 = num2;
			while(num2!=0){
			if(Calculate.isDivisibleBy(originalNum1, originalNum2) == true){
				return (int) absValue(num1 / num2);
					}else{
					int num3 = num1;
					num1 = num2;
					num2 = num3 % num2;
					}
				}
				return (int) absValue(num1);
		}

	//This methdo takes in a double then returns a squareroot as a result
		public static double sqrt(double num) {
			double guessNumber = 0; 
			double result;
			if(num == 0) {
				result = 0;
			}else if(num > 0) {
				result = num / 2;
				while(absValue(guessNumber - result) >= 0.005) {
					guessNumber = result;
					result = (guessNumber + (num / guessNumber)) / 2;
				}
			}else {
				throw new IllegalArgumentException("no square root of negative number");
			}
			return round2(result);
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
	 
	 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			

