package day09;

public class Main {
	public static void main(String args[]) {
	int firstnumber =0;
	int secondnumber =1;
	
	int number=10;
	for(int i=1;i<=number;i++) {  
		System.out.print(firstnumber+" ");//  0 1 1 2 3 5 8 13
		int thirdnumber=firstnumber+secondnumber;
		firstnumber=secondnumber;
		secondnumber=thirdnumber;
		//System.out.println(thirdnumber);
	}
	
	}

}
