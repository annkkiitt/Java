package Fundamentals_Of_Java.Unit_01.Practical_03;

/**
 * P3_Task01_VariablesAndDataTypesInJava
 */
public class P3_Task01_VariablesAndDataTypesInJava {
    static int q=11;
    int p = 10;
 
    public static void main(String[] args) {
        //variable declaration
        int a,b,c;
        float pi;
        double d;
        char e;

        //valid initializations
        pi= 3.14f;
        d = 20.22d;
        e = 'a';
        a=10;
        b=10;
        c=10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(pi);
        System.out.println(d);
        System.out.println(e);

        int myNum = 10; //Integer (whle number)
        float myFloatNum = 4.99f; //Floating Point number
        char myLetter = 'D'; //character
        boolean myBool = true; //Boolean
        String myText = "Helloji"; //String

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        // Java variable Type conversion and Type casting
        double f;
        int i = 10;
        f = i; //implicit type casting 

        double g =10;
        int j;
        j = (int)g ; //explicit type casting

        System.out.println(f);
        System.out.println(i);
        System.out.println(g);
        System.out.println(j);

        byte k = 10; //1 byte
        boolean l = true; // 1 bit = true or flase only
        long m = 10L; 
        float n = 1.2f;
        double o = 1.2d;

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);

        System.out.print(ABC.j); //data + functions/methods
        //ABC display

        ABC obj1 = new ABC();
        System.out.println(obj1.i++);
        System.out.println(obj1.i);

        ABC obj2 = new ABC();
        System.out.println(obj2.i);

        // System.out.println(obj1.j++);
        // System.out.println(obj1.j);
        // System.out.println(obj2.j);

        System.out.println(ABC.j++);
        System.out.println(ABC.j);

        ABC.typeConversionAndTypeCasting();
        ABC.display();
        display();
    }

    int r = 10;
    static void display(){
        int a = 5;//local variable
        System.out.println("This is display method! " + a );
    }  
    
}


class ABC{
    static int j = 10; // class variable/static variable
    int i = 10; // Instance variable
    static void display(){
        int a = 5; // local variable
        System.out.println("This is display method(in class)");
        System.out.print(a);
    }

    static void typeConversionAndTypeCasting(){
        double f; //64 slots
        int i = 10; //32 slots
        f = i; //Type conversion
        System.out.println(f);

        double g = 10; //64 slots
        int j;
        j = (int)g; //Type casting

        System.out.println(i);
        System.out.println(j);
    }
}