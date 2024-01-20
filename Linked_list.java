package day09;

import java.util.HashSet;
import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> li=new LinkedList<>();
		li.add(21);li.add(23);li.add(24);li.add(25);li.add(26);li.add(27);li.add(27);li.add(29);
		
		removeDuplicates(li);
	}
	//Remove duplicate 
	public static void removeDuplicates(LinkedList<Integer> llist) {
		
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<llist.size();i++) {
			if(set.contains(llist.get(i))) {
				//set.remove(llist.get(i));
			}else {
				set.add(llist.get(i));
			}
			System.out.println("Totally avoid the duplicate element "+set);
		}
		
		HashSet<Integer> set1=new HashSet<>(llist);
		System.out.println("List to Set conversion "+set1);
		//refnameset.addAll(refnamelist)
		
	
		
		
	}
	

}
