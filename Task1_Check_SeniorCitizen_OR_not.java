package java_Tasks;

import java.util.Scanner;

public class Task1_Check_SeniorCitizen_OR_not {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the age of a person");
	    Scanner sc = new Scanner(System.in);
	    int age = sc.nextInt();
	    if (age < 60)
	    {
	    	System.out.println("Person is not a senior citizen");
	    }
	    else
	    {
	    	System.out.println("Person is a senior citizen");
	    }
	    sc.close();
	}

}
