package Unit_01.Practical_05;

public class P5_Task02_MethodsInJava {
	public static void main(String[] args) {
		
		// Calling display method definition
		ABC3.display();
		System.out.println(ABC3.a);
	}

}
class ABC3 {
	
	static int a = 10;
	
	/*Actual method definition
	 * Datatype methodName(DataType2 p1, DataType2 p2){
	 * 
	 * methodBody;
	 * 
	 * }
	 */
	static void display() {
		
		int b = 10;
		int a = 10;
		System.out.println(b);
		System.out.println(a);
	}
	
	int display2() {
		
		System.out.println(a);
		//As a was a local variable so we can not access it outside the method
		//System.out.println(b);
		
		return a;
	}
}