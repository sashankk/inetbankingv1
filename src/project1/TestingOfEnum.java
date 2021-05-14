package project1;

public class TestingOfEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingOfEnum te = new TestingOfEnum();
		te.monthName("adf");
	}
		public void monthName(String month) {

	if(month.equalsIgnoreCase("JANUARY")) {
		
		System.out.println("This is January month");
				
	}
	else if(month.equalsIgnoreCase("FEB")) {
		
		System.out.println("This is February month");
		}
	
	else if(month.equalsIgnoreCase("Mar")) {
		
		System.out.println("This is March month");
		}
	
	else {
	
	System.out.println("This is nothing");
	}


		}
}


