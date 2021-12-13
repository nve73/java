/**
* Java 1. Homework #1
*
* @author Natalia Erokhova
* @version 10.12.2021
*/
class HomeWorkOne {
    public static void main (String[] args) {
        printTreeWords ();
        checkSumSign ();
        printColor ();
        compareNumbers ();
    }
    
    static void printTreeWords () {
        System.out.println ("Orange\nBanana\nApple");
    }
    
    public static void checkSumSign () {
        int a = 7, b = -10;
        System.out.println ((a + b >= 0) ? "Sum is positive" : "Sum is negative");
    }
    
    public static void printColor () {
        int value = 100;
        
        if (value <= 0) {
            System.out.println ("Red");
        } 
        if (value > 0 && value <= 100) {
            System.out.println ("Yellow");
        } 
        if (value > 100) {
            System.out.println ("Green");
        }
    }
    
    public static void compareNumbers () {
        int a = 3, b = 3;
        System.out.println ((a >= b) ? "a>=b" : "a<b");
    }
}