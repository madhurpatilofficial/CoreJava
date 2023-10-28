
public class CountUpperLower {
	public static void main(String[] args) {
		String name = "MadhurPatil";
		String UpperString = name.toUpperCase();
		int UpperCaseCount = 0;
		int LowerCaseCount = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == UpperString.charAt(i)) {
				UpperCaseCount++;

			} else {
				LowerCaseCount++;
			}
		}
		System.out.println("Upper Case Count: " + UpperCaseCount);
		System.out.println("Lower Case Count: " + LowerCaseCount);

	}

}
