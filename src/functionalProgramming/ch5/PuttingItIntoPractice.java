package functionalProgramming.ch5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
 * 1. Find all transactions in the year 2011 and sort them by value (small to high).
2. What are all the unique cities where the traders work?
3. Find all traders from Cambridge and sort them by name.
4. Return a string of all traders� names sorted alphabetically.
5. Are any traders based in Milan?
6. Print all transactions� values from the traders living in Cambridge.
7. What�s the highest value of all the transactions?
8. Find the transaction with the smallest value.
 * */

public class PuttingItIntoPractice {
public static void main(String[] args) {
	
	 Trader raoul = new Trader("Raoul", "Cambridge");
     Trader mario = new Trader("Mario","Milan");
     Trader alan = new Trader("Alan","Cambridge");
     Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
         new Transaction(brian, 2011, 300), 
         new Transaction(raoul, 2012, 1000),
         new Transaction(raoul, 2011, 400),
         new Transaction(mario, 2012, 710),	
         new Transaction(mario, 2012, 700),
         new Transaction(alan, 2012, 950)
     );	
		
	//1. Find all transactions in the year 2011 and sort them by value (small to high).
		
     List<Integer> values=transactions.stream().filter(t->t.getYear()==2011)
    		 									.map(Transaction::getValue)
    		 									.sorted()  // find out how to use Comparator comparing
    		 									.collect(Collectors.toList());
     values.stream().forEach(System.out:: println);
     System.out.println("======================================================================");
     
   //2.  What are all the unique cities where the traders work?  
     
     List<Trader> traders=Arrays.asList(raoul, mario, alan, brian);
     Stream<String> treadersStream=traders.stream().map(Trader:: getCity).distinct();
     treadersStream.forEach(System.out::println);
     
     System.out.println("======================================================================");
     //3. Find all traders from Cambridge and sort them by name.
     
     treadersStream=traders.stream()
    		 .filter(t-> t.getCity().equals("Cambridge"))
    		 .map(Trader::getName).sorted();
     treadersStream.forEach(System.out:: println);
     
     System.out.println("======================================================================");
    		 
   //  4. Return a string of all traders� names sorted alphabetically.    
     
     treadersStream=traders.stream().map(Trader::getName).sorted();
     treadersStream.forEach(System.out::println);
     
     System.out.println("======================================================================");
     
     //6. Print all transactions� values from the traders living in Cambridge.
     
    Stream<Integer> valuesStream=transactions.stream().filter(t->t.getTrader().getCity().equals("Cambridge")).map(Transaction:: getValue);
     values.forEach(System.out:: println);
     
     System.out.println("======================================================================");
     
   //  7. What�s the highest value of all the transactions?
     valuesStream=transactions.stream().map(Transaction::getValue);
     valuesStream.reduce(Integer::max);
     
     System.out.println("======================================================================");
     
    //8. Find the transaction with the smallest value.
     valuesStream.reduce(Integer::min);
}
}
