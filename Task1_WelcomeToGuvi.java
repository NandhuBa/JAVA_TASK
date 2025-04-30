package java_Tasks;

import java.util.Scanner;

public class Task1_WelcomeToGuvi {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       System.out.println("Enter the string");
       Scanner sc=new Scanner(System.in);
       String Str = sc.nextLine();
       for (int i=0; i<10; i++)
       {
    	   System.out.println(Str);
       }
       sc.close();
	}
}
