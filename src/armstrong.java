
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number  =152;
		int orginal=number;
		int rem;
		int arms=0;
		while(number>0)
		{
			rem=number%10;
			arms=arms+(rem*rem*rem);
			number=number/10;
		}
		if(arms==orginal)
		{
		System.out.println(" arms");
		System.out.println(" ar");
		System.out.println(" a");
	
		}
		else {
			System.out.println("not arms");
		}
			
		

	}

}
