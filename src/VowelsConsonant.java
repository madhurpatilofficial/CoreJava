
public class VowelsConsonant {
	public static void main(String[] args) {
		String s = "madhurpatilup";
		char[] vol = { 'a', 'e', 'i', 'o', 'u' };
		boolean vl;
		boolean ct = false;
		int vowel = 0;
		int con = 0;
		for (int i = 0; i < s.length(); i++) {
			vl = false;
			for (char c : vol) {
				if (s.charAt(i) == c) {
					vl = true;
				} else {
					ct = true;
				}
			}
			if (vl) {
				vowel++;
			} else {
				con++;
			}

		} 

		System.out.println("Vowels: " + vowel);
		System.out.println("Consonant: " + con);
	}

}
