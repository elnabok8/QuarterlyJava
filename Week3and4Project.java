

public class Week3and4Project {
	public static void main(String[] args) {
		
		// Create an array of int called ages that contains the following 
		//values: 3, 9, 23, 64, 2, 8, 28, 93.
		//Programmatically subtract the value of the first element in the 
		//array from the value in the last element of
		//the array (i.e. do not use ages[7] in your code). 
		//Print the result to the console.
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(ages[ages.length-1] - (ages[0]));

		//Add a new age to your array and repeat the step
		//above to ensure it is dynamic (works for arrays 
		//of different lengths).
		
		int [] theDynamicAges = {3, 88, 9,45, 23, 64, 2, 8, 28, 93};
		System.out.println(theDynamicAges[theDynamicAges.length-1] - (theDynamicAges[0]));
		
		
		
		
		
		//Use a loop to iterate through the array and
		//calculate the average age. 
		//Print the result to the console.
		int sum = 0;
		for(int i=0; i<ages.length; i++) {
			sum += i;
		} System.out.println(sum/(ages.length));
		
			
		
		
		
		
		
		
		//Create an array of String called names that contains 
		//the following values: “Sam”, “Tommy”, “Tim”, “Sally”, 
		//“Buck”, “Bob”.
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		
		
		
		
		
		
		
		//Use a loop to iterate through the array and calculate 
		//the average number of letters per name. Print the result to the console.
		int sum2 = 0;
		for (String name:names) {
			sum2 += name.length();
		
		} System.out.println();
		System.out.println(sum2/names.length);
			
		
		
		
		
		//Use a loop to iterate through the array again and concatenate
		//all the names together, separated by spaces, and print the result to the console.
		String concatination = "";
		for (String name:names) {
			concatination += name + " ";
			
		} System.out.println(concatination);
		
		
		
		
		//How do you access the last element of any array?
		//[array.length-1];
		
		
		
		//How do you access the first element of any array?
		
		//array[0];
		
		
		
		
		
		//Create a new array of int called nameLengths.
		//Write a loop to iterate over the previously created names array 
		//and add the length of each name to the nameLengths array.
	
	int [] nameLengths = new int[names.length];
	for (int i = 0; i<names.length; i++) {
		nameLengths[i] += names[i].length();
		System.out.print(nameLengths[i] + " ");
		
		
		
	}
	
	System.out.println();
	
		//Write a loop to iterate over the nameLengths array and calculate the sum 
		//of all the elements in the array. Print the result to the console.

	int arraySum=0;
		for (int name:nameLengths) {
			arraySum += name;
	//	System.out.println(arraySum);	
			
		}
		System.out.println(arraySum + " total"); 
		
		
		System.out.println(fullName ("John", "Henry"));
		
		System.out.println(manyArguments ("Hi Adele", 6));
		
		
		System.out.println(illPass (true, 85));
		
		}//main method ends
	
		
		
		
		//Write a method that takes a String, word, and an int, n, as arguments and 
		//returns the word concatenated to itself n number of times. (i.e. if I pass in 
		//“Hello” and 3, I expect the method to return “HelloHelloHello”)
	
 public static String manyArguments (String word, int n) {

	if (n==0)
		return " ";
			 for (int i = 0; i<=n-2; i++) {
				 System.out.println(word);
				 
				
	
		
		}
			 return word;
	}
	 
	
		//Write a method that takes two Strings, firstName and lastName,
		//and returns a full name (the full name should be the first and the last name 
		//as a String separated by a space).


	

	public static String fullName (String firstName, String lastName) {
		String fullName = (firstName + " " + lastName);
		
		return fullName;
		}
		
		
		
		//Write a method that takes an array of int and returns true if the sum of 
		//all the ints in the array is greater than 100.
		
		public static boolean biggerThanHundred (int[] integers) {
	
			int arraySum=0;
				for (int num:integers) {
					arraySum += num;
		} 
				return (arraySum>100);
		}
		
		
		
		
		//Write a method that takes an array of double and returns the average of 
		//all the elements in the array.
		
		public static double calculateAverage (double[] arrayOne) {
			double arraySum = 0;
					for (double num:arrayOne) {
						arraySum += num;}
					
			return arraySum/arrayOne.length;
			
		}
		
		
	
		
		//Write a method that takes two arrays of double and returns true if the 
		//average of the elements in the first array is greater than the average 
		//of the elements in the second array.
		public static boolean isArrayOneGreater (double[] arrayOne, double[] arrayTwo) {
			return (calculateAverage(arrayOne) > calculateAverage(arrayTwo));
			
		}
		
		
		
		
		
		//Write a method called willBuyDrink that takes a boolean isHotOutside, 
		//and a double moneyInPocket, and returns true if it is hot outside and if 
		//moneyInPocket is greater than 10.50.
		
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside = true && moneyInPocket>10.50) {
			return true;
	} return false;
	}
		
		
		
		//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	
	public static boolean illPass (boolean havingaGoodTime, double grade) {
		if (havingaGoodTime=true || grade>70.00) {
			return true;
		} else
			
		
		return false;
		
	}
}
	

