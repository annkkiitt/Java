/*
keywords in java:
	-50 such keywords
	-Reserved words (meaning are already defined by the compiler)
	-48 use 
	-2 future use (end with *)
		goto*
		const*	
	-version : 1.2v,1.4v,5.0v
		not used -> * (goto*,const*)
		1.2v -> ** (assert**)
		1.4v -> *** (sctrictfp***)
		5.0v -> **** (enum****)
	-We are not supposed to use,such java keywords as indentifiers in our program
		Method
		Object
		Variable
*/


package Fundamentals_Of_Java.Unit_01.Practical_02;

public class P2_Task01_KeywordsInJava {
    public static void main(String[] args) {
		System.out.println("Java Keywords!");
		
		//Syntax error on token "int", delete this token
		ABC int = new ABC();
	}
	
	//Syntax error on token "int", Identifier expected
	void int() {
			
	}
	
	//Syntax error on token "double", invalid VariableDeclaratorId
	int double = 10;
}

class ABC{
	int x=5;
}
