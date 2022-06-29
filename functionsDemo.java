package garimachikaramam;

public class functionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// part 1: Normal call
		System.out.println("part 1 : Normal call");
		System.out.println("hello");
		// function call
		addition();
		System.out.println("bye");
		// part 2 = function with parameters 
	System.out.println("part 2 : function with parameters");

		additionparams(10,20);
		additionparams(20,30);
	}
		public static void additionparams(int a , int b) {
			int c = a +b;
			System.out.println(c);
			}
		

	// fnction defination
	public static void addition() {
		int a = 5;
		int b = 10;
		int c = a + b;
		System.out.println(c);
	}

}
