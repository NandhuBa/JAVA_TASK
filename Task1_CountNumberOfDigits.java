package java_Tasks;

import java.util.Scanner;

public class Task1_CountNumberOfDigits {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int c = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt(); 
	    
	    while (a != 0) {
	      // num = num/10
	      a = a/10;
	      ++c;
	    }

	    System.out.println("The Number of digits " + c);
	    sc.close();
	}

}
