import java.util.Arrays;

/*Nicole Low
 * October 30 ,2017
 * LotsOfCopies
 */ 

//My try of Array Mini Lab 
public class LotsOfCopies {
	public static void main (String [] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		
		LotsOfCopies.changeMe(num, strMain, arrMain);
		
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(Arrays.toString(arrMain));
		
		//integer
		int a = 5;
		int b = a;
		a = 10;
		System.out.println(b);
		
		//String
		String c = "two";
		String d = c;
		c = "98";
		System.out.println(d);
		
		//Array
		int[] e = {5,2,3,4};
		int[] f = e;
		e[1]=10;
		e[3]=3;
		System.out.println(Arrays.toString(f));
	}
	
	public static void changeMe (int x, String str, int[] arr) {
		x = 2;
		str = "4";
		arr[0] = 2;
		arr[1] = 3;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
	// In Class Part 1

		 System.out.println("In changeMe, before the change, num (aka x):"+x);
				x=4;
		 System.out.println("In changeMe, after the change, num (aka x):"+x);
		
		 System.out.println("In changeMe, before the change, strMain (aka str):"+str);
		 System.out.println("In changeMe, before the change, strMain (aka str):"+str);
		 		str ="The is the new str";

		 System.out.println("In changeMe, before the change, asrrMain (aka arr):"+Arrays.toString(arr));
		 		arr[0]=12;
		 System.out.println("In changeMe, after the change, asrrMain (aka arr):"+Arrays.toString(arr));
	
	// In Class Part 2
				//a = Start
				//b = a
				//a == new
				//b ==???

				//integer
				//x = 3
				//int bint = x;
				//x = 23; 
				//System.out.println("b" + bint);

				//String
				//str = "hhhhh";
				//String bstr =str;
				//str = "iiiii";
				//System.out.println("bstr:" + bstr);
				
				//Array
				//int [] barr = arr;
				//arr [0]=200
				//System.out.println ("barr: + Array.tostring(basrr));
	}
}
