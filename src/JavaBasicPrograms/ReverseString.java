package JavaBasicPrograms;

public class ReverseString {
	public static void main(String[] args) {
		String str="RoshanGiri";
		String rev="";
		int len = str.length();
		
		System.out.println(len);
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
		
	}

}
