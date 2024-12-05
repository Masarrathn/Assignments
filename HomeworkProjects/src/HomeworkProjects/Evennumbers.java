package HomeworkProjects;

import java.util.Scanner;

public class Evennumbers {

	public static void main(String[] args) {
		
		int number;
		System.out.println("Enter the number ");
		
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		if( number % 2 ==0)
		 System.out.println("The number is Even");
		 
		 else
		 System.out.println("The number is Odd");
		 

	}

}
