package JavaBasicPrograms;

public class LengthOfDigits {

	public static void main(String[] args) {
		int num=5673,temp=num,len=0;
		while(temp>0) {
			temp=temp/10;
			len=len+1;
			//System.out.println("Lengh of digit "+len);
		}
		System.out.println("Lengh of digit "+len);

	}

}
