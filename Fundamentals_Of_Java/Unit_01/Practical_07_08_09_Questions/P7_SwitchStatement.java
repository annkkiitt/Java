package Fundamentals_Of_Java.Unit_01.Practical_07_08_09_Questions;
import java.util.Scanner;

/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

public class P7_SwitchStatement {

	public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		
		// Write Logic here!
        System.out.println("Enter your choice: 1)Year 2)Month 3)Day");
        Scanner obj2 = new Scanner(System.in);
        int num= obj2.nextInt();

        switch(num){
            case 1: System.out.println("2022");
                    break;
            case 2: System.out.println("April");
                    break;
            case 3: System.out.println("Saturday");
                    break;
            case 4: System.out.println("Not applicable");
                    break;
            default: System.out.println("INVALID");
                    break;
        }
        obj2.close();
	}
}
