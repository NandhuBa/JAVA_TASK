package java_Tasks;

import java.util.Scanner;

public class Task1_CheckEvenNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        System.out.println("Enter a number");
		
		Scanner sa = new Scanner(System.in);
		int i = sa.nextInt();
	
		if (i%2==0)
		{
			System.out.println(i + " is an even number");
		}
		else
		{ 
			System.out.println(i + " is an odd number");
		}
		sa.close();
	}

}
