package day09;

public class SridharInterviewquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int speed=150;
		for(int i=81;i<=speed;i++) {
			
			
			//System.out.println();
			if((i>80)&&(i<=149)) {
				if(i%5==0) {
					System.out.println("alaram  "+i);
					if((i>120)&&(i<=149)){
						System.out.println("govern  "+i);
					}
				}
				
			}else
				System.out.println("License cancelled  "+i);
		}
	}

}
