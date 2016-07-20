package egs.collection.ch3;

public class GenericClassUsedWithoutType <T> {
	
	private void toString(T str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
	GenericClassUsedWithoutType<String> typedObject=new GenericClassUsedWithoutType<>();
	GenericClassUsedWithoutType nonGenericCode=new GenericClassUsedWithoutType<>();
	
	
	typedObject.toString("Typed");
nonGenericCode.toString("Not typed");
	}

}
