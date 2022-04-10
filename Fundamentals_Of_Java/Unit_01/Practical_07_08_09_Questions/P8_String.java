package Fundamentals_Of_Java.Unit_01.Practical_07_08_09_Questions;

/* Problem Statement:
P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		// Write Logic Here!
        boolean flag = false;
        int i=0;
        int j= s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                flag=true;
                i++;
                j--;
            }
            else{
                flag=false;
                break;
            }
            
        }
        if(flag == true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

	}

	void reverseOfAString(String s) {
		// Write Logic Here!
        // Write Logic Here!
		String nstr="";
		char ch;
		for (int i=0; i<s.length(); i++)
	      {
	        ch= s.charAt(i); //extracts each character
	        nstr= ch+nstr; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ nstr);

	}
	
	void stringEqualOrNot(String s1,String s2) {
		// Write Logic Here!
		// Write Logic Here!
		boolean areTwoStringsEqual = s1.equals(s2);
		 
        System.out.print("Two strings are equal : "+areTwoStringsEqual);
	}
}