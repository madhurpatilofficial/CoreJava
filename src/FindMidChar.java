
public class FindMidChar {
	public static void main(String[] args) {
		String s = "madhurp";
		int len = s.length();
		int mid = len/2;
		
		if(len%2 !=0) {
			System.out.println(s.charAt(mid));
		}
		else {
			System.out.println("The string is of Even length!!!!");
		}
	}

}
