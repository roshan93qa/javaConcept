package JavaBasicPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=5673,temp=num,rev=0, rem;
		while(temp>0) {
			rem=temp%10;
			temp=temp/10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse number is "+rev);

	}

}
