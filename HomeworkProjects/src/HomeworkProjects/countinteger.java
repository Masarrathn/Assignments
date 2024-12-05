package HomeworkProjects;

import java.util.Scanner;

public class countinteger {

     
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
        Scanner in= new Scanner(System.in);
		
		int num = in.nextInt();
		int count = 0;
		
		while(num>0) {
			num= num / 10;
			count ++;
			
		}
	System.out.println("Number of digits in the number is " +count);
	
}
}
