package JavaBasicPrograms;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String str1="keep";
		String str2="peek";
		char[]ch1=str1.toLowerCase().toCharArray();
		char[]ch2=str2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("The string is anagram");
		}else {
			System.out.println("This string is not anagram");
		}
		
	}

}
