package flight;

import java.util.Scanner;

public class Flight {
	
	private int flightno;
	private String destination;
	private float distance,fuel;
	
	private float calfuel() {
		
		if(this.distance <= 1000)
			fuel = 500;
		else if(this.distance > 1000 && this.distance <=2000)
		    fuel = 1100;
		else if (this.distance >200)
			fuel = 2200;
		
		return fuel;
	}
	
	public void feedinfo() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Flight number : ");
		this.flightno = scan.nextInt();
		System.out.print("Enter Destination : ");
		this.destination = scan.next();
		System.out.print("Enter Distance : ");
		this.distance = scan.nextFloat();
		scan.close();
		this.fuel = this.calfuel();
	}
	
	public void showinfo() {
		
		System.out.println("Flight Number : "+this.flightno);
		System.out.println("Destination : "+this.destination);
		System.out.println("Distance : "+this.distance);
		System.out.println("Fuel required : "+this.fuel);
	}
	
	
	
	

	public static void main(String[] args) {
		Flight fl = new Flight();
		fl.feedinfo();
		fl.showinfo();

	}

}
