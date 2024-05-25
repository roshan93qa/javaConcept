package JavaBasicPrograms;

public class PallindromeNumber {
	public static void main(String[] args) {
		int num=121,temp=num,rev=0,rem;
		while(temp>0) {
			rem=temp%10;
			temp=temp/10;
			rev=rev*10+rem;
		}
		if(num==rev) {
			System.out.println("The number is pallindrome "+num);
		}else {
			System.out.println("The number is not pallindrome "+num);
		}
		
	}

}
