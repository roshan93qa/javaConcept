package JavaBasicPrograms;

public class SumofOddAndEvenNumber {

	public static void main(String[] args) {
		
		   
		        int num = 123456,rem;
		        int sumEven = 0;
		        int sumOdd = 0;

		        while (num > 0) 
		        {
		            rem = num % 10;
		            num=num/10;
		            if (rem % 2 == 0) 
		            {
		                sumEven = sumEven+rem;
		            } else 
		            {
		                sumOdd =sumOdd+rem;
		            }
		           
		        }

		        System.out.println("Sum of even digits: " + sumEven);
		        System.out.println("Sum of odd digits: " + sumOdd);
		    }
		

	}


