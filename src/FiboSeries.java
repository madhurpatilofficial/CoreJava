import java.util.Scanner;

public class FiboSeries {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int number = ip.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b);

		for (int i = 0; i < number; i++ ) {

			int c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;

		}
	}

}
