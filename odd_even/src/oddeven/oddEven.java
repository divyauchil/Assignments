package oddeven;

import java.util.Scanner;

public class oddEven {

	public static void main(String[] args) {
		int num;
		String res;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		res = (num%2 == 0)?"Number is even":"Number is odd";
		System.out.println(res);
				
		

	}

}
