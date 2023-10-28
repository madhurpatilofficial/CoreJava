import java.util.ArrayList;
import java.util.Arrays;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 23, 45));

		ArrayList<Integer> OddList = new ArrayList<Integer>(Arrays.asList());
		ArrayList<Integer> EvenList = new ArrayList<Integer>(Arrays.asList());

		int EvenSum = 0;
		int OddSum = 0;
		for (int n : arr) {
			if (n % 2 == 0) {
				EvenSum += n;
				EvenList.add(n);

			} else {
				OddSum += n;
				OddList.add(n);

			}
		}

		System.out.println("Even Numbers are: " + EvenList);
		System.out.println("Odd Numbers are: " + OddList);
		System.out.println("Sum of even numbers is: " + EvenSum);
		System.out.println("Sum of Odd numbers is: " + OddSum);
	}

}
