package egs.instanceofcheck.ch1;

public class Test {

	public static void main(String[] args) {
	Hippo hippo=new Hippo(); 
	
	Lion loi=new Lion();
	
	// Class instance of check is compile time process
	
	//boolean isLion= hippo  instanceof Lion; //DOES NOT COMPILE  not in the same inheritance tree
	
	//Interface instanceof check is runtime process 
	
	boolean isMother=hippo instanceof Mother;	 // even if hippo is not Mother , this is check at runtime 
	                                            // reason is that subclass ss of Hippo may later implement Mother  interface 
	
	Hippo motherHippo=new MotherHippo();
	boolean ismotherHippo=motherHippo instanceof Mother;
	
	}

	}


