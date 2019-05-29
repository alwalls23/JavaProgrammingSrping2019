package day47_blocks;

public class AllBlocks {
	
	int nonStaticInt = 10;
	static int staticInt = 10;
	
	static {
		System.out.println("STATIC BLOCK - I run first and only once");
		staticInt--;
	}

	{
		System.out.println("INIT BLOCK - I run each time object is creaed before constuctor");
		nonStaticInt += 5;
		staticInt += 5;
	}

	public AllBlocks() {
		System.out.println("Constucor - I run each time object is creaed. after init block");
		nonStaticInt += 3;
		staticInt += 3;
	}

}
