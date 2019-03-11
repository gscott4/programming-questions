package leetcode.easy;

public class ReverseString {

	public void reverseInit() {
		String word = "hello";
		String reverse = reverseString(word);
		System.out.println(reverse);
	}
	
	public String reverseString(String s) {
		char[] characters = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		while(i < j) {
			char temp = characters[i];
			characters[i++] = characters[j];
			characters[j--] = temp;
		}
		
		return new String(characters);
	}
	
	
}
