package java_Tasks;

import java.util.Scanner;

public class Task1_CheckSumOfNumbers {

	public static void main(String[] args) 
	{
		//Question 1 : 
		
		System.out.println("Enter the numbers");
		
		Scanner sa = new Scanner(System.in);
		int a = sa.nextInt();
		
		Scanner sb = new Scanner(System.in);
		int b = sb.nextInt();
		
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		Scanner sd = new Scanner(System.in);
		int d = sd.nextInt();
		
		System.out.println(a + " " + b + " "+ c+ " "+d);
		
		int e = a+b;
		 int f = c+d;
		
		if (e>f)
		{
			System.out.println("The sum of a and b is greater than the sum of c and d");
		}
		else
		{
			System.out.println("a and b not greater than c and d");
		}
	sa.close();
	sb.close();
	sc.close();
	sd.close();
	}
	
}
