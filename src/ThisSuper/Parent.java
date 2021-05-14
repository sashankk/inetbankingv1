package ThisSuper;

public class Parent {
	
	Parent() {
		
		
		
		System.out.println("no-arg constructor");
		
	}
	
	Parent(int x, int y) {
		
		
		
		System.out.println("2-arg constructor");
	}
	
	public static void main(String[] args) {
		
		//Parent p = new Parent(10,10);
		
		Parent p1 = new Parent();
	}
}
