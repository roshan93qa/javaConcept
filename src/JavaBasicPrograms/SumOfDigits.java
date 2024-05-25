package JavaBasicPrograms;

public class SumOfDigits {

	public static void main(String[] args) {
		int num=1234,temp=num,rem;
		int sum=0;
		while(temp>0) {
			rem=temp%10;
			temp=temp/10;
			sum=sum+rem;
		}
		System.out.println("Sum of dogit :"+sum);
	}

}
