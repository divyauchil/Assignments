package test;

import java.util.Scanner;

public class Test {
	
	private int TestCode;
	private String Description;
	private int NoCandidate,CenterReqd;
	
	
	private int calcntr() {
		CenterReqd =(int)(NoCandidate/100+1);
		
		return CenterReqd;
	}
	
	public void schedule() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Test code : ");
		this.TestCode = scan.nextInt();
		System.out.print("Enter Description : ");
		this.Description = scan.next();
		System.out.print("Enter no.of candidates : ");
		this.NoCandidate = scan.nextInt();
		scan.close();
		this.calcntr();
		
	}
	
	public void disptest() {
		System.out.println("Test code : "+this.TestCode);
		System.out.println("Description : "+this.Description);
		System.out.println("No.of condidates : "+this.NoCandidate);
		System.out.println("Center required : "+this.CenterReqd);
		
		
		
	}

	public static void main(String[] args) {
		Test ts = new Test();
		ts.schedule();
		ts.disptest();

	}

}
