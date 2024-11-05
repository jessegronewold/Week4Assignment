package week4codingproject;

public class Week4CodingProject {

	public static void main(String[] args) {
		// Here is my Week 4 coding assignment!
		
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 29, 93};

		//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		
		int result = ages[ages.length - 1] - ages[0];
		System.out.println(result + " is the result of subtracting the first element in the array from the value in the last element of the array");
		System.out.println(); // gives space between answers when ran

		//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		
		int[] ages2 = new int[9];

		//i. Make sure that there are 9 elements of type int in this new array.  

		//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 

		int result2 = ages2[ages2.length - 1] - ages2[0];
		
		//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).

		//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.

		double sumAge = 0; // declaring initial value to be 0; made it a double to carry the decimals
		for (int i:ages) {
			sumAge = sumAge + i; //adding sumAge to each element as it passes through array
		}
		//System.out.println(sumAge); did this early to make sure it printed the sum correctly
		
		double averageAge = sumAge / ages.length;
		System.out.println(averageAge + " is the average age of the ages in the array");
		System.out.println();
				
		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

		//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.

		double sumNames = 0; //same as before
		for (String name : names) { // saying for every name there is in array names
			sumNames += name.length();
		}
		
		//System.out.println(sumNames); checked to make sure it calculated the sum correctly
		
		double averageNameLength = sumNames / names.length;
		System.out.println(averageNameLength + " is the average length of the names in the array");
		System.out.println();
		
		
		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.

		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println(); // did this so it went to the next line so my answers for the two questions wouldn't be in the same line 
		System.out.println(); // did this to have a space between answers
		
		//3. How do you access the last element of any array?

		// array[array.length - 1]
		
		//4. How do you access the first element of any array?
		
		//array[0]

		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.

		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			 nameLengths[i]= names[i].length();
		}
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sumLengths = 0;
		for (int length : nameLengths) {
			sumLengths += length;
		}
		System.out.println(sumLengths + " is the sum of all the elements in the nameLengths array");}

		//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

		public static String concatenation(String word, int n) {
			String word1 = "";
			for (int i = 0; i < n; i++) // returns the String word concatenated n number of times
				{word1 += word;
				
			}
			return word1;
		}
		
		
		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	
		public static String createFullName(String firstName, String lastName) {
			String fullName = firstName + " " + lastName;
			return fullName;
		}
	

		//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

		public static boolean greaterThan100(int[] arr) {
			int sum = 0;
			for (int i: arr) {
				sum += i;
			} if (sum > 100)
				return true;
			
			return false;
		}
	
		//10. Write a method that takes an array of double and returns the average of all the elements in the array.

		public static double arrayAverage(double[] numbers) {
			double sum = 0;
			for (int i = 0; i < numbers.length; i++) {
				sum += numbers[i];
			}
			double average = sum / numbers.length;
			return average;
			
		}
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.

		public static boolean greatestAverageArray(double[] array1, double[] array2) {
			double sum1 = 0;
			double sum2 = 0;
			for (int i =0; i < array1.length; i++) {
				sum1 += array1[i]; // adding each element of the array with the sum as we pass through the array
			}
			
			double average1 = sum1 / array1.length;
			
			for (int j = 0; j < array2.length; j++) {
				sum2 += array2[j];
			}
			
			double average2 = sum2 / array2.length;
			
			if (average1 > average2) {
				return true;
		
			} else {
				return false;
			}
			//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		} public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside = true && moneyInPocket > 10.50) {
				return true;
				} else {
					return false;
				}
			}

		//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

	public static int areaRectangleOrSquare(int length, int width) {
		int length1 = 0;
		int width1 = 0;
		int area = length1 * width1;
	return area;
	
	// this is a method that will find the area of a square or rectangle!
	}
}
