package day09;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=6,b=12,c=18;
		int d=0,g=0;
		for(int i=1;i<=c;i++) {
			if(a%i==0 && b%i==0 && c%i==0) {
				g=d*i;
		           d= i;
		          // System.out.println("i is"+i);   
				//System.out.println(g);
			}
		}
		
		String name="sdrg";
		System.out.println(name=="sdrg");
	}

}
