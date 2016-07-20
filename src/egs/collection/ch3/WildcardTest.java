package egs.collection.ch3;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

public class WildcardTest {
	
	//WILDCARD generics are immutable
	private static void testWildcard(List<?> list){
		
	//list.add("quack"); //DOES NOT COMPILE
	}
	
	// UPPER BOUND generics are immutable
	private static void  testUpperBound( List<? extends Object> list){
		// list.add("dfe"); //DOES NOT COMPILE
	}
	
	//LOWER BOUND generics are mutable
	private static void testLowerBound(List<? super Exception> list){
//	 list.add(new Object()); // DOES NOT COMPILE
		list.add(new Exception());
		list.add(new FileNotFoundException());
		
	}
	
	public static void main(String[] args) {
		
		//ANY TYPE IS ACCEPTABLE AS METHOD ARGUMENT
		List<Integer> toPassToWildcardMethod=new ArrayList<>();
		WildcardTest.testWildcard(toPassToWildcardMethod);
		
		//INTEGER EXTENDS OBJECT
		List<Integer> toPassToupperBoundMethod=new ArrayList<>();
		WildcardTest.testUpperBound(toPassToupperBoundMethod);
		
		//OBJECT IS SUPPER OF EXCEPTION
		List<Object> toPassToLowerBoundMethod=new ArrayList<>();
		WildcardTest.testLowerBound(toPassToLowerBoundMethod);
		
		WildcardTest.testLowerBound(new ArrayList<Exception>());
	}

}
