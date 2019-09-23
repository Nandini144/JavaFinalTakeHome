/*Generate 500 random numbers and print the Nth smallest
 *  number in a programming language of your choice.
 *   (Ask user for the Nth smallest number)*/
//Getting the smallest from distinct random numbers
package exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SmallestFromDistinctRandom {

	public static void main(String[] args) {

		System.out.print("Please enter the number N to generate Nth smallest number : ");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		// creating random numbers
		Random rand = new Random();

		// creating tree set
		Set<Integer> randSet = new TreeSet<>();
		// adding random numbers in treeSet
		while (randSet.size() <= 500) {

			randSet.add(rand.nextInt(1000));

		}

		System.out.println("Distinct Random numbers : " + randSet);

		// Converting treeSet into an int array
		int[] randArr = new int[randSet.size()];
		int i = 0;

		for (Integer intArr : randSet) {

			randArr[i++] = intArr;

		}

		System.out.println("Int Array : " + Arrays.toString(randArr));
		System.out.println(N + "th smallest number : " + randArr[N - 1]);
	}

}
