package day09;

//import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class reversenum {
	public static void main(String args[]) {
		int num = 76543;
        int s,a=0;
		

		while (num > 0) {
            s=num%10;
            a=a*10+s;
			num = num / 10;
			
			
		}
		
		System.out.println("num is ---->"+a);
	//	System.out.println("count is  " + count);
		
		
		//Fibonoci COUNT
	/*int a=10;
	int b=0;
	int c=1;
	int d=0;
	int e=0;
	for (int i = 0; i <=a; i++) {
		d=b+c;
		b=c;
		c=d;
		e=d;
		System.out.println(d);
		
	}
	System.out.println("e is  "+ e);  */
	
	
	// Swaping two number
	
	/*int fnum=21;
	int snum=43;
	int third=0;
	int fourth=0;
	fnum=fnum+snum;//64
	snum=fnum-snum;//64-43=21
	fnum=fnum-snum;//64-21=43
    third=snum;//21
    fourth=fnum;//43
	
	
	System.out.println("fnum is  "+fnum);
	System.out.println("fnum is  "+snum);
	System.out.println("fnum is  "+third);
	System.out.println("fnum is  "+fourth);*/
	
	// Armstrong number
	
	int a1=151;
	int b1=a1;
	int a2=0;
	int a3=0;
	int sum=0;
    while(a1>0) {
	a2=a1%10;//2//5//1
    a3=a2*a2*a2;
    sum=sum+a3;
    a1=a1/10;
    System.out.println(a3);
}
    if (sum==b1) {
    	System.out.println("This is amstring"+sum);
		
	}
	else {
		System.out.println("This is not amstrong"+sum);
	}
   // System.out.println("a1 is"+a1);
    //System.out.println("a2 is"+a2);
    //System.out.println("b1 is"+b1);*/
    
	
	}
}