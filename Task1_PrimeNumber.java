package java_Tasks;

import java.util.Scanner;

public class Task1_PrimeNumber {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
	
        System.out.println("Enter a number");
		
		Scanner sa = new Scanner(System.in);
		int a = sa.nextInt();
		int count = 0;
		 
		for (int i=1; i<=a; i++)
		{  
			if(a%i==0)
			{
				count++;
			}
			
		}
			if(count==2)
				{
				System.out.println("Number is a prime number");
				}
		else
		{
			System.out.println("Number is not a prime number");
		}
		 
		sa.close();		
	}
}
