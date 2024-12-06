package HomeworkProjects;
import java.util.Scanner;
public class fourintegers {

	public static void main(String[] args) {
    
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the first number: ");
     int a= in.nextInt();
    
     Scanner in1 = new Scanner(System.in);
     System.out.println("Enter the second number: ");
     int b= in1.nextInt();
     
     Scanner in2 =new Scanner(System.in);
     System.out.println("Enter the third number: ");
     int c= in2.nextInt();
     
     Scanner in3 = new Scanner(System.in);
     System.out.println("Enter the fourth number: ");
     int d= in3.nextInt();
     
     int sum1 = a + b;
     
     System.out.println("Sum of a and b :" +sum1);
     
     int sum2 = c + d;
     System.out.println("Sum of c and d :" +sum2);
     
     
     if(sum1>sum2)
     System.out.println("Sum of a and b is greater than sum of c and d ");
	 
     else if(sum2>sum1)
    	 System.out.println("Sum of c and d is greator than sum of a and b ");
     }
	
}
