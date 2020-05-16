package book;

import java.util.Scanner;


public class Book {
	
	Scanner scan = new Scanner(System.in);
	
	private int bookno,copies;
	private String booktitle;
	private float price,cost;
	
	private float totalcost(int n) {
		
		cost = price * n;
		
		return cost;
	}
	
	
	
public void input() {
		
		
		System.out.print("Enter Book no : ");
		this.bookno = scan.nextInt();
		System.out.print("Enter Book Title : ");
		this.booktitle = scan.next();
		System.out.print("Enter Price : ");
		this.price = scan.nextFloat();
		
	}
	
	public void purchase() {
		
		
		System.out.print("Enter copies : ");
		this.copies = scan.nextInt();
		scan.close();
		this.cost = this.totalcost(copies);
		
		
		System.out.println("Book Number : "+this.bookno);
		System.out.println("Book Title : "+this.booktitle);
		System.out.println("Price : "+this.price);
		System.out.println("Total cost : "+this.cost);
	}
	

	public static void main(String[] args) {
		Book bk = new Book();
		bk.input();
		bk.purchase();

	}

}
