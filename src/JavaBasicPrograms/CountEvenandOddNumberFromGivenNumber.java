package JavaBasicPrograms;

public class CountEvenandOddNumberFromGivenNumber {

	public static void main(String[] args) {
		int num=12345;
		int even_count=0;
		int odd_count=0;
		while(num>0) {
			int rem=num%10;
			num=num/10;
			if(rem%2==0) {
				even_count++;
			}else {
				odd_count++;
			}
		}
		
		System.out.println("This is the even number count "+even_count);
		System.out.println("This is the even number count "+odd_count);

	}
	
}
