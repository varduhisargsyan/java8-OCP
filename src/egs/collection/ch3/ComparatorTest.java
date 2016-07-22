package egs.collection.ch3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
	
	private int  id; 
	private String status;
	
	private ComparatorTest(int id, String status){
		this.id=id; 
		this.status=status; 
		
	}
	
	
	public static void main(String[] args) {
	List <ComparatorTest> list=new ArrayList<>();
	list.add(new ComparatorTest(7, "object1"));
	list.add(new ComparatorTest(37, "object6"));
	list.add(new ComparatorTest(57, "object7"));
	list.add(new ComparatorTest(75, "object55"));
	
	
	Comparator<ComparatorTest> comparator=new Comparator<ComparatorTest>() {

		@Override
		public int compare(ComparatorTest o1, ComparatorTest o2) {
			Comparator<ComparatorTest> c=Comparator.comparing(ComparatorTest::getId).thenComparing(ComparatorTest::getStatus);
			return c.compare(o1, o2);
		}
		
	};
	
	list.sort(comparator);
	System.out.println(list.toString());
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}




	@Override
	public String toString() {
		return "ComparatorTest [id=" + id + ", status=" + status + "]";
	}

}
