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
		
		List<Transaction> listTX=Arrays.asList(
				new Transaction(120, 6, Transaction.TYPE.GROCARY), 
				new Transaction(60, 5,Transaction.TYPE.GROCARY),
				new Transaction(80, 2,Transaction.TYPE.COFFEE),
				new Transaction(30, 3,Transaction.TYPE.MEAT));
		
		
		List<Integer> txAggregatedList=listTX.stream()
				.filter(i->i.getType()==Transaction.TYPE.GROCARY)
				//.sorted((Transaction::getValue)
				.map(Transaction:: getId)
				.sorted()
				.collect(Collectors.toList());
				
		
		txAggregatedList.forEach(System.out::println);
		
		//  TEST LIMIT
		
		
		List<Integer> limitList=Arrays.asList(3,4,4,6,6,6,7,8,9,10);
		
	limitList.stream()
		.filter(i->{System.out.println("Filtering "+ i);
		            return i% 2==0;
		            })
		.map(i-> {System.out.println("Mpping " +i);
		          return i*i;})
		.limit(3)
		.collect(Collectors.toList());
		
		
		
		
	}

}
