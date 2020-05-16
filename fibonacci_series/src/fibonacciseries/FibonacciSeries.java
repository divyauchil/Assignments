package fibonacciseries;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num , a =0 , b =1, c;
		
		//Input number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		sc.close();
		
		System.out.println("Fibonacci series till "+num+"is : \n" +a+ "\n" +b);
		//Finding fibonacci
		
		for (int i = 3 ; i <= num ; i++) {
			
			c = a + b;
			a = b;
			b =c;
			System.out.println(+c);
		}

	}

}
