package JavaBasicPrograms;

public class PallindromString {

	public static void main(String[] args) {
		String str="madam";
		String rev="";
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("The is string is pallindrom "+rev);
		}else {
			System.out.println("This is string is not pallindrom "+rev);
		}
	}

}
