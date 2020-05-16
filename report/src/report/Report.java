package report;

import java.util.Scanner;

public class Report {
	
Scanner scan = new Scanner(System.in);
	
	private int adno;
	private String name;
	private float marks[] = new float[5],average,total;
	
	private float getavg() {
		
		for (int i=0 ; i<=4;i++) {
			total = total + marks[i];
		}
		average = total/5;
		return average;
	}
	
	public void readinfo() {
		System.out.print("Enter Addmission number : ");
		this.adno = scan.nextInt();
		System.out.print("Enter Name : ");
		this.name = scan.next();
		System.out.println("Enter Marks");
		for (int i=0 ; i<=4;i++) {
			System.out.print("Mark "+(i+1)+":");
		this.marks[i] = scan.nextInt();
		}
		scan.close();
		this.getavg();
		
	}
	
	public void displayinfo() {
		System.out.println("Addmission Number : "+this.adno);
		System.out.println("Name : "+this.name);
		System.out.println("Marks entered");
		for (int i=0 ; i<=4;i++) {
			System.out.print("Mark "+(i+1)+":");
		System.out.println(this.marks[i]);
		}
		
		System.out.println("average : "+this.average);
		
		
		
	}

	public static void main(String[] args) {
		Report rp = new Report();
		rp.readinfo();
		rp.displayinfo();


	}

}
