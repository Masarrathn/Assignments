package HomeworkProjects;

import java.util.Scanner;

public class primenumbers {



	public static void main(String[] args) {
		int number;
		System.out.println("Enter the number : "); 
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		int flag = 0;
		if (number == 0 || number == 1) {
			System.out.println( "The number is not a prime"); 
			}
			
		else {
			int middleNumber  = number / 2;
			for(int i=2; i<=middleNumber; i++) {
			if(number % i == 0) {
		    System.out.println( "The number is not prime"); 
		    flag = 1; 
            break; 
		}
	
			else 
		System.out.println( "is prime number");
        
			}
			}
		}

	}

	

		
		
	
		
	


			
			
	
			