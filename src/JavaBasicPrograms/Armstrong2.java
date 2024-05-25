package JavaBasicPrograms;

public class Armstrong2 {

	public static void main(String[] args) {
		int num=3,rev=0;
		while(num>0) {
			num=num%10;
			num=num/10;
			num=(int) Math.pow(num,3);
			rev=rev+num;
		}
		if(rev==num) {
			System.out.println("This is armstrong number");
		}else {
			System.out.println("This is not a armstrog number");
		}

	}

}
