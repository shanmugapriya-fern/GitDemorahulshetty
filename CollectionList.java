package day09;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printpattern() ;
		
		List <Integer> arraylist = new ArrayList<>();
		arraylist.add(7);
		arraylist.add(9);
		arraylist.add(3);
		arraylist.add(22);
		arraylist.add(11);


		for(int var:arraylist) {

		}



		//System.out.println("--"+par);
	}
	public static void firstlettercapz() {	
		String par="hi this is priya";
		String[] split=par.split(" ");
		String name="";
		for(int i=0;i<split.length;i++) {
			//	System.out.println(split[i]);
			String abc=	Character.toUpperCase(split[i].charAt(0))+split[i].substring(1);
			name=name+" "+abc;


		}
		System.out.println("--"+name);
	}
	public static void secondletterreverse() {
		String par="hi this is priya";
		String[] var=par.split(" ");
		String mon="";
		String ann="";
		for(int i=0;i<var.length;i++) {
			 System.out.print(mon+" "+ann);
			if(i%2!=0) {
				String ace=var[i];
				for(int j=0;j<ace.length();j++) {
					char abc=ace.charAt(j);
					var[i]=abc+ann;
					ann=var[i];
					
		}
			}else
				 mon=var[i];		
		}
		
	}
	public static void smallestarray() {
		int[] arr= {29,53,21,31,41,51,46,19};
		int abc=0;
		for(int i=0;i<arr.length;i++) {
			 abc=arr[0];	
			if(abc>arr[i]) {
				abc=arr[i];
			}
		}
		System.out.println("smallest number in the array is  "+abc);
	}
	
	public static void duplicates() {
		int[] arr= {29,39,50,50,29,39};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
	
	public static void stringvalues() {
		String[] arr= {"Hai","This","is","Priya","Hai"};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					System.out.println(arr[i]);
				}
				
			}
		}
	}
	public static void swapcharinstrings() {
		String arr="abcdef";                  //output badcfe
		char[] chararray=arr.toCharArray();
		System.out.println(chararray);
		for(int i=0;i<chararray.length;i+=2) {
	   char	temp=	chararray[i];
	   chararray[i]=chararray[i+1];
	   chararray[i+1]=temp;
		}
		System.out.println(chararray);
		arr=new String(chararray);
		System.out.println(chararray);
	}
	
	
	public static void swapstrings() {
		String[] arr= {"Thai","This","is","Priya"};
		System.out.println	(arr);
		for(int i=0;i<arr.length;i+=2) {
			//System.out.println(i);
			//System.out.println(Arrays.toString(arr));
			System.out.println(arr.length);
			
			if((i+1)!=arr.length) 
			{
			String temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		}
	System.out.println	(Arrays.toString(arr));
		
	}
	
	public static void printpattern() {
		int n=5;
		//rectangle
		for(int i=0;i<n;i++) {
			System.out.print("*");
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	//rightangle triangle
		for(int i=0;i<n;i++) {
			System.out.print("*");
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("inverse rightangle trangle");
		for(int i=n;i>=0;i--) {
			System.out.print("*");
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		}
	}
	
	
	









