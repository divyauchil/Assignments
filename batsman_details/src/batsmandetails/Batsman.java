package batsmandetails;

import java.util.Scanner;

public class Batsman {
	
	private int bcode;
	private String bname;
	private int innings,notout,runs;
	private float batavg =0;
	
	private float calcavg() {
		batavg =runs/(innings-notout);
		
		return batavg;
	}
	
	public void readdata() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Batsman code : ");
		this.bcode = scan.nextInt();
		System.out.print("Enter Batsman Name : ");
		this.bname = scan.next();
		System.out.print("Enter Innings : ");
		this.innings = scan.nextInt();
		System.out.print("Enter notout : ");
		this.notout = scan.nextInt();
		System.out.print("Enter Runs : ");
		this.runs = scan.nextInt();
		scan.close();
		this.calcavg();
		
	}
	
	public void displaydata() {
		System.out.println("batsman code : "+this.bcode);
		System.out.println("Batsman Name : "+this.bname);
		System.out.println("Innings : "+this.innings);
		System.out.println("Notout : "+this.notout);
		System.out.println("Runs : "+this.runs);
		System.out.println("Batsman Average : "+this.batavg);
		
		
		
	}

}
