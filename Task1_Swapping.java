package java_Tasks;

import java.util.Scanner;

public class Task1_Swapping {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter 2 numbers");
		
		Scanner sa = new Scanner(System.in);
		int a = sa.nextInt();
		
		Scanner sb = new Scanner(System.in);
		int b = sb.nextInt();
		
     int temp;
     
     System.out.println("Numbers before swapping" +" "+ a + " "+ b);
     
     temp = a;
     a=b;
     b=temp;
     
     System.out.println("Numbers after swapping" +" "+ a + " "+ b);
     
     sa.close();
 	 sb.close();
	}

}
