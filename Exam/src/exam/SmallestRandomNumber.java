/*Generate 500 random numbers and print the Nth smallest
 *  number in a programming language of your choice.
 *   (Ask user for the Nth smallest number)*/
//Getting smallest number from ascendingly 
//sorted random numbers which includes duplicates.
package exam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SmallestRandomNumber {

	public static void main(String[] args) {
		System.out.print("Enter the integer number N to generate Nth smallest number : ");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		// Creating object for random numbers
		Random rand = new Random();
		// creating an array list of Integers
		ArrayList<Integer> randArr = new ArrayList<Integer>();
		// Adding random numbers to the list
		int i = 0;
		while (randArr.size() < 500) {
			randArr.add(i, rand.nextInt(1000));
			i++;
		}

		System.out.println("Integer array list : " + randArr);

		// converting to int array
		int[] intArr = new int[randArr.size()];
		int index = 0;
		for (Integer arr : randArr) {
			intArr[index] = arr;
			index++;
		}
		// sorting the array
		Arrays.parallelSort(intArr);

		System.out.println("Sorted array : " + Arrays.toString(intArr));
		System.out.println(N + "th smallest number : " + intArr[N - 1]);
	}

}
