package powernumber;

import java.util.Scanner;

public class PowerNumber {

	public static void main(String[] args) {
		
		double num1, num2, power;
		
		//Input data
		System.out.println("Enter Number 1");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextDouble();
        System.out.println("Enter Number 2");
        num2 = sc.nextDouble();
        sc.close();
        
        //calculate power
        power = Math.pow(num1, num2);
        
        //Print result
        System.out.println(num1+" to the power of "+num2+" is "+power);
        
	}

}
