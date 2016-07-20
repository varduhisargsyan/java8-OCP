package egs.collection.ch3;

import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		TreeSet<String> treeSet=new TreeSet<>();
		treeSet.add("one");
		treeSet.add("One");
		treeSet.add("ONE");
		
		String one="one";
		String One="One";
		String ONE="ONE";
				
		System.out.println(one.hashCode());
		System.out.println(One.hashCode());
		System.out.println(ONE.hashCode());
		
		String aaa="aaa";
		String Aaa="Aaa";
		String AAA="AAA";
		
		System.out.println(aaa.hashCode());
		System.out.println(Aaa.hashCode());
		System.out.println(AAA.hashCode());	
		
		System.out.println(treeSet.ceiling(aaa));
	}

}
