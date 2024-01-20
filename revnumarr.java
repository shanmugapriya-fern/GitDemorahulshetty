package day09;

public class revnumarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,60,45,65};
		int i=0 , j=arr.length-1;
		int temp=0;
		while( i<=j) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
		for(int k=0;k<=arr.length-1;k++) {
			System.out.println(arr[k]);
		}

	}

}
