package dhruv;



import java.util.Scanner;

public class parameter {
		
		public static void calculate(int a, int b, int c) {
			int d = a + b + c;
			int f = a - b - c;
			
			if(45>d) {
				System.out.println(f);
			}
			else {
				System.out.println(d);
			}
			
         }
	     public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter first number:");
			int a= sc.nextInt();
			
			System.out.println("enter second number:");
			int b= sc.nextInt();
			
			System.out.println("enter third number:");
			int c= sc.nextInt();
			
			calculate(a,b,c);
	     }
     }


