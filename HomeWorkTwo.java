/**
* Java 1. Homework #2
*
* @author Natalia Erokhova
* @version 13.12.2021
*/
class HomeWorkTwo {
    public static void main (String[] args) {
        System.out.println (comparSum (25, -20));
        System.out.println (comparSum (10, 5));
        printNum (34);
        printNum (0);
        printNum (-5);
        System.out.println (comparNum (12));
        System.out.println (comparNum (0));
        System.out.println (comparNum (-12));
        printLine ("Two", 3);
        printLine ("Lesson 2", 1);
    }
    
    static boolean comparSum (int a, int b) {
        return ((a + b) > 10 && (a + b) < 20);
    }
    
    static void printNum (int a) {
        System.out.println (a >= 0 ? "Number is positive" : "Number is negative");
    }
    
    static boolean comparNum (int a) {
        return a < 0;
    }
    
    static void printLine (String word, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println (word);
        }
    }
}