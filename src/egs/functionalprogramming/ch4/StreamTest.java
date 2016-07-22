package egs.functionalprogramming.ch4;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("wsdre" , "ere", "efre");
		List<String> stream=list.stream().map(i-> i.charAt(0)+ "FIRST CHAR").collect(Collectors.toList());
		for(String  str: stream){
			System.out.println(str);
		}
		
		
	}

}
