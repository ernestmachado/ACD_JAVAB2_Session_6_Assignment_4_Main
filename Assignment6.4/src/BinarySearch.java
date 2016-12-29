import java.util.Scanner;
//Write a program to search an element in one-dimensional array using Binary Search Algorithm.
public class BinarySearch {
	public static void main(String args[]) {
		int first; // This will store the first position of the array
		int last;	// This will store the last position of the array
		int middle; // This will calculate and store the mid position of the array
		int input;	// This accept the integer inputed by the user in scanner
		int search;	// This will accept the number to be searched from the array
		int numberarray[]; // This array will store the values of the numbers entered

		///--->>> Ask the user how many elements needs to be entered
		Scanner no = new Scanner(System.in);
		System.out.println("How many elements do you wish to enter in the array?");
		input = no.nextInt();
		numberarray = new int[input];

		///--->>> Ask the user to enter the elements value in integer format
		System.out.println("Enter " + input + " number of integers in ASCENDING order.");
		for (int c = 0; c < input; c++)
			numberarray[c] = no.nextInt();

		//--->>> Ask the user the value of the element to be searched
		System.out.println("Enter value to find");
		search = no.nextInt();
		no.close();
		//--->>> Set the value of first and last index of the array
		first = 0;
		last = input - 1;
		//--->>> Calculate the middle of the array.
		middle = (first + last) / 2;

		//--->>> Iterate to find the element else change the first and last 
		while (first <= last) {
			if (numberarray[middle] < search)//--->>> Search the second half
				first = middle + 1;
			else if (numberarray[middle] == search) {//--->>> Element found
				System.out.println(search + " found at location " + (middle + 1) + ".");
				break;
			} else
				last = middle - 1;//--->>> Search the first half
			//--->>> recalculate the middle for the next iteration
			middle = (first + last) / 2;
		}
		//If first becomes greater than last means that the element is not present in the array.
		if (first > last)
			System.out.println(search + " is not present in the list.\n");
	}

}
