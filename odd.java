package day09;

public class odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=24;
		int odd=0;
		int sum=0;
		while(odd<=n) {
			if(odd%2!=0) {
				System.out.println(odd);
				sum=sum+odd;
			}
			odd++;
			//System.out.println(sum);
		}
		System.out.println(sum);
	}

}
