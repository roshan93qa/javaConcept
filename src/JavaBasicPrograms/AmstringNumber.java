package JavaBasicPrograms;

public class AmstringNumber {

	public static void main(String[] args) {
		int num=153,temp=num,rem,rev=0;
		while(temp>0) {
			rem=temp%10;
			temp=temp/10;
			rev=rev+(rem*rem*rem);
			//temp=temp/10;
		}
		if(rev==num) {
			System.out.println("The number is armstrong");
		}else {
			System.out.println("The number is not armstrong");
		}

	}

}
