package day09;
import java.util.Scanner;
class pattern01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		int num=0;
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				num=0;
				System.out.print(num);
			}else {
				num=1;
				System.out.print(num);
			}
				
			for(int j=1;j<=i;j++) {
				if(num==0) {
				num=1;
				System.out.print(num);
				}else {
					num=0;
					System.out.print(num);
				}
				
				
			}
			System.out.println();
		}

	}

}
