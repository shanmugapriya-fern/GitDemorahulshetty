package day09;

public class patternpro1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int n=4;
		for(int i=0;i<=n;i++) {
			System.out.print("1");
			for(int j=1;j<=i;j++) {
				for(int k=i;k<=i;k++) {
					System.out.print(j+1);
				}
				
			}
			
			System.out.println();
		}
		


	}

}
