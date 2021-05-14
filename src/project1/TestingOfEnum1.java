package project1;

public class TestingOfEnum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestingOfEnum1 te = new TestingOfEnum1();
		te.monthName(TestEnum.JAN);
	}
		public void monthName(TestEnum month) {

	if(month.equals(TestEnum.JAN)) {
		
		System.out.println("This is January month");
				
	}
	else if(month.equals(TestEnum.FEB)) {
		
		System.out.println("This is February month");
		}
	
	else if(month.equals(TestEnum.MAR)) {
		
		System.out.println("This is March month");
		}
	
	else {
	
	System.out.println("This is nothing");
	}


		}
}
