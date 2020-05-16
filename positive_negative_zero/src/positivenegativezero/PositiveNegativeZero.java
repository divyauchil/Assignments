package positivenegativezero;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number , positiveCount =0, negativeCount = 0, zeroCount =0;
		
		
		char choice;
		
		do{
			
			System.out.println("Enter the number");
			number = sc.nextInt();
			
			if(number >0)
			
				positiveCount ++;
			else if (number<0)
				negativeCount ++;
			else
				zeroCount ++;
			
			
			
			
            System.out.print("Do you want to continue y/n? ");
            choice = sc.next().charAt(0);
			
		}while (choice == 'y'||choice=='Y');
		sc.close();
		
		System.out.print("Positive count is: "+positiveCount);
		System.out.print("Negative count is: "+negativeCount);
		System.out.print("Zero count is: "+zeroCount);
       
		

	}

}
