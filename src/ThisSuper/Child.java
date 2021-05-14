package ThisSuper;

public class Child extends Parent{
	
	void m3() {
		System.out.println ("M3 method from child");
	}

	void m4() {
		System.out.println ("M4 method from child");
	}
	
	void m2() {
		System.out.println("M2 method from child");
	}
	public static void main(String [] args) {
		Parent p = new Parent();
		
		p.m2();
		
		Child c = new Child();
		c.m2();
		
		Parent p1 = new Child();
		p1.m2();
	}
	
}
