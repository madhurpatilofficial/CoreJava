
public class FindMidElement {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 7, 5, 9, 10};
		int mid;
		int len = arr.length;
		if (len % 2 != 0) {
			mid = len / 2;

			System.out.println(arr[mid]);
		} else {
			System.out.println("Cannot find element - Length of array is even!!!");
		}

	}

}
