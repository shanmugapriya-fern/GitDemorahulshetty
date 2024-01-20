package day09;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153 ;
		int num=n;
		int reverse = 0;
		int ams=0;
	while (n>0) {
		
		reverse=n%10;
		ams=ams+reverse*reverse*reverse;
		n=n/10;
		System.out.println(ams);
		}
		
		if(num == ams) {
			System.out.println("This Amstrong");
		}else
		System.out.println("This not Amstrong");
	}

}
