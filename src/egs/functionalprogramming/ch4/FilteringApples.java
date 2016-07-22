package egs.functionalprogramming.ch4;

import java.util.*;
import java.util.function.Predicate;

import javax.swing.event.ListSelectionEvent;
// USE OF PREDICATE
public class FilteringApples{
	
	public static void main (String args [] ) {
		
	List<Apple> inventory=Arrays.asList(new Apple("red" , 90),new Apple("green", 110), new Apple("green", 10));
		
      FilteringApples.filterApples(inventory, apple-> "green".equals(apple.getColor())).toString();
     
    System.out.println(FilteringApples.filterApples(inventory, FilteringApples::isGreenApple).toString());
    System.out.println(FilteringApples.filterApples(inventory, FilteringApples::isHeavyApple).toString());
	}
	
	private static  List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate){
		List<Apple> applesFiltered=new ArrayList<>();
		for (Apple apple : inventory) {
				if(predicate.test(apple)){
					applesFiltered.add(apple);
				};
		}
		return applesFiltered;
	}
	
	private static boolean isHeavyApple(Apple apple){
		return apple.getWeight()>100;
	}
	
	private static boolean isGreenApple(Apple apple){
		return "green".equals(apple.getColor());
	}

  private static class  Apple{
	  
	private String color; 
	private double weight; 
	
	public Apple(String color , double weight){
		this.color=color; 
		this.weight=weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "]";
	}
	
	
	
  }
}