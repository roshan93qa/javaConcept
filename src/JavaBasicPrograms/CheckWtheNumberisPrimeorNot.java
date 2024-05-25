package JavaBasicPrograms;

public class CheckWtheNumberisPrimeorNot {

	public static void main(String[] args) {
		int num=4;
		int count=0;
		if(num>0)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
				if(count==2)
				{
					System.out.println("The number is prime "+num);
				}else 
				{
					System.out.println("The number is not prime "+num);
		        }
			
		}
		else 
		{
			System.out.println("This number is not a prime"+num);
		}
		
		
			

	}

}
