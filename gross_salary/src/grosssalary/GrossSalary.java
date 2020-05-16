package grosssalary;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
        float basicSalary,hra,da,grossSalary;
        
        System.out.println("Enter Basic Salary");
        Scanner sc = new Scanner(System.in);
        basicSalary = sc.nextFloat();
        sc.close();
        if(basicSalary >= 1500) {
        	hra = 500;
        	da=basicSalary * 98/100;
        }else {
        	hra =basicSalary * 10/100;
        	da = basicSalary * 90/100;
        }
        grossSalary=basicSalary+hra+da;
        System.out.println("Gross Salary is: "+grossSalary);
	}

}
