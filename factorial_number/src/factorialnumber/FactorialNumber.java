package factorialnumber;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int num;
        long factorial=1;
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        for (int i=1; i <= num ; i++) {
        	factorial = factorial*i;
        }
        System.out.println("Factorial of number "+num+" is "+factorial);
	}

}
