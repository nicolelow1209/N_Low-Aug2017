/*Nicole Low
 * October 4,2017
 *Processing Numbers 
 */
	
public class ProcessingNumbers {
	public static void main(String[] args) {
		//initialization
		
		System.out.println("How many numbers do you want?");
		Scanner userinput = new Scanner(System.in);
		int totalNumber = userinput.nextInt();
		int next;
		System.out.println("What are the numbers?");
		next = userinput.nextInt();
			//initialization
			int maximum = next;
			int minimum = next;
			int sumEven = next;
			int largestEven = next;
			System.out.println("What are the numbers?");
			next = userinput.nextInt();
		for(int i = 1; i < totalNumber; i++) {
			
		
		//This if statement can find the maximum.
			next = userinput.nextInt();
			
		//This if statement can find the maximum.
			if(next > maximum) {
				maximum = next;
			}
		
		//This if statement can find the minimum.
			if(next < minimum) {
				minimum = next;
			}

		//This if statement can find the sum of all the even numbers.
			if(next % 2 == 0) {
				sumEven += next;
			}

		//This if statement can find the largest even number in this string of numbers.
			if(next > largestEven && next % 2 == 0) {
				largestEven = next;
			}
		}	

	//These will print out max, min, sum of even numbers, max of even number.
			System.out.println("Max: " + maximum);
			System.out.println("Min: " + minimum);
			System.out.println("The sum of all the even numbers is " + sumEven);
			System.out.println("Largest Even Number: " + largestEven);
