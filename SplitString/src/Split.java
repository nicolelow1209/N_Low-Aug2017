/*Nicole Low
 * October 26, 2017
 */
//
//test hhhh

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		
		// Your task Part 0
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
//			it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples".split("really")
//			it will split at the word "really" and return an array of ["I "," like "," red apples!"]
		//play around with String.split! 
		//What happens if you "I reallyreally likeapples".split("really") ?
		
		String[] arr="I like apples!".split(" "); //Putting the result from split to an array
		
		System.out.println(Arrays.toString(arr)); //using toString to print the array 
		System.out.println(Arrays.toString("I like apples".split(" ")));  //Example 1
		System.out.println(Arrays.toString("I really like really red apples".split("really"))); //Example 2
		System.out.println(Arrays.toString("I really like reallyreally red apples".split("really")));
		System.out.println(Arrays.toString("I reallyreally likeapples".split("really")));
		
		System.out.println(Arrays.toString(Split.sandwich("applespineapplesbreadlettustomatobaconmayohambreadcheese")));
		System.out.println(Arrays.toString(Split.sandwich("applesbreadpineapplesbreadlettustomatobreadbaconmayohambreadcheese")));
		
		System.out.println(Arrays.toString(Split.lunch("apples pineapples bread lettus tomato bacon mayo ham bread cheese")));
		System.out.println(Arrays.toString(Split.lunch("apples pineapples bread lettus tomato bread bacon bread mayo ham bread cheese")));
	}
	//Your task Part 1:
	/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
	* use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
	* What if it's a fancy sandwich with multiple pieces of bread?
	*/
	public static String[] sandwich(String food) {
		String[] splitFood = food.split("bread");
		String[] layers = new String[splitFood.length - 2];
		for(int i = 1; i < splitFood.length - 1; i++) {
			layers[i - 1] = splitFood[i];
		}
		return layers;
	}
	
	//Your task Part 2:
	/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
	* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
	* Again, what if it's a fancy sandwich with multiple pieces of bread?
	*/
	public static String[] lunch(String food) {
		String[] splitFood = food.split(" ");
		int firstBread = -1;
		int lastBread = splitFood.length;
		for(int i = 0; i < splitFood.length; i++) {
			if(splitFood[i].equals("bread")) {
				if(firstBread == -1) {
					firstBread = i;
				}
				else {
					lastBread = i;
				}
			}
		}
		//For debug purposes
		//System.out.println(firstBread);
		//System.out.println(lastBread);
		String[] layers = new String[lastBread - firstBread - 1];
		for(int j = firstBread + 1; j < lastBread; j++) {
			layers[j - (firstBread + 1)] = splitFood[j];
		}
		return layers;
	}
}