package egs.functionalprogramming.ch4;

public class Transaction {
	
	public enum TYPE {
		GROCARY, COFFEE, MEAT
	}
private int value; 
private int id; 
private TYPE type;
public Transaction(int value, int id, TYPE type) {
	super();
	this.value = value;
	this.id = id;
	this.type = type;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public TYPE getType() {
	return type;
}
public void setType(TYPE type) {
	this.type = type;
}





}
