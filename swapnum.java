package day09;

public class swapnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=35;
		int y=25;
		x=x+y;
		y=x-y;
		
		x=x-y;
		System.out.println("x is"+x);
		System.out.println("y is"+y);
		
		int c=20,d=15;
		int e=0;
		e=c;
		c=d;
		d=e;
		System.out.println("c is"+c);
		System.out.println("d is"+d);
		
		int year=2001;
		if(year%4 ==0 && year%100==0 && year%400==0) {
			System.out.println("Leap year");
			
		}else
		System.out.println("No leap year");
		

	}

}
