package absolutevalue;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		System.out.println(Math.abs(num));

	}

}
