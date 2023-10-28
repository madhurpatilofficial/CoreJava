import java.util.HashSet;

public class SortNumbers {
	public static void main(String[] args) {
		int temp = 0;
		int[] arr = { 39, 2, 4, 5, 2, 5, 7 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		HashSet <Integer> set = new HashSet<Integer> ();
		for(int s : arr) {
			set.add(s);
		}
		System.out.println(set);
		
	}
}