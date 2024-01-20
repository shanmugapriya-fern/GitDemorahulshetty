package day09;

import java.util.Scanner;

public class Table {
public static void main(String[] args) {
	//int a=2; 
	//int sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");//10 * 2 = 20
	int num=sc.nextInt();
	for (int i = 1; i<=num; i++) {
		if(i*2%10==5) {
		//	 System.out.println(i+" * 2 = "+i*2);
			 System.out.println(i);
		}
		}
   
 
	}
}

