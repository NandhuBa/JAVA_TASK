package java_Tasks;

import java.util.Scanner;

public class Task1_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("Enter the number :");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        long f = 1; 

        if (num < 0) {
            System.out.println("Cannot find Factorial for Negative numbers");
        } 
        else 
        {
            for (int i = 1; i <= num; i++) 
            {
                f = f*i;
            }
            System.out.println("Factorial of " + num + " is: " + f);
        }
        s.close();
	} 
}