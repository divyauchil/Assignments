package maximunminimum;

import java.util.Scanner;

public class MaximunMinimum {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int number , maximumNumber = Integer.MIN_VALUE, minimumNumber = Integer.MAX_VALUE;
		
		
		char choice;
		
		do{
			
			System.out.println("Enter the number");
			number = sc.nextInt();
			
			if(number > maximumNumber)
				maximumNumber = number;
			else if(number < minimumNumber)
				
			minimumNumber = number;
			
			
			System.out.print("Do you want to continue y/n? ");
            choice = sc.next().charAt(0);
			
		}while (choice == 'y'||choice=='Y');
		sc.close();
		
		System.out.print("Maximum Number is: "+maximumNumber);
		System.out.print("Minimum Number is: "+minimumNumber);
		

	}

}
