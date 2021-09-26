package lab10;

//mport java.util.HashSet;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestHashSet test = new TestHashSet();
		test.printSet();
		
		System.out.println("All Countries Printed \n\n\n\n");
		test.addCountry("Pizza Kong");
		test.printSet();
		if(test.matchCountry("Pizza kong"))
		{
			System.out.println("Pizza kong rules all");
			
		}
		
		test.clearSet();
		System.out.println("Set is cleared");
		test.printSet();
	}

}
