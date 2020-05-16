package studentdetails;

import java.util.Scanner;

public class Student {
	
	private int admno;
	private String sname;
	private float eng,math,science;
	private float total =0;
	
	private float ctotal() {
		 total = eng+math+science;
		
		return total;
	}
	
	public void Takedata() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Admission Id : ");
		this.admno = scan.nextInt();
		System.out.print("Enter Your Name : ");
		this.sname = scan.next();
		System.out.print("Enter English marks : ");
		this.eng = scan.nextFloat();
		System.out.print("Enter Maths marks : ");
		this.math = scan.nextFloat();
		System.out.print("Enter Science marks : ");
		this.science = scan.nextFloat();
		scan.close();
		this.ctotal();
		
	}
	
	public void Showdata() {
		System.out.println("Admission Id : "+this.admno);
		System.out.println("Your Name : "+this.sname);
		System.out.println("English marks : "+this.eng);
		System.out.println("Maths marks : "+this.math);
		System.out.println("Science marks : "+this.science);
		System.out.println("Total : "+this.total);
		
		
		
	}

}
