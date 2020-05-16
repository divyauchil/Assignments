package discount;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
        int quantity;
        double price,expense,dis = 0.10,exafterdiscount,discountamount;
		
		System.out.println("Enter the Quantity");
		Scanner sc = new Scanner(System.in);
		quantity=sc.nextInt();
		System.out.println("Enter the Price");
		price = sc.nextDouble();
		sc.close();
		expense = quantity * price;
		discountamount = expense * dis;
		exafterdiscount = expense - discountamount;
		if(expense > 5000) {
			System.out.println("Expense is: "+exafterdiscount);
		} else {
			System.out.println("Expense is: "+expense);
		}
		

	}

}
