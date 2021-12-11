class HomeWorkOne {
	public static void main (String[] args) {
		printTreeWords ();
        checkSumSign ();
        printColor ();
        compareNumbers ();
	}
    
    public static void printTreeWords () {
        System.out.println ("Orange\nBanana\nApple");
    }
    
    public static void checkSumSign () {
        int a = 7, b = -10;
        
        if (a + b >= 0){
            System.out.println ("Sum is positiv");
        } else {
            System.out.println ("Sum is not positiv");
        }
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
        if (a >= b) {
            System.out.println ("a>=b");
        } else {
            System.out.println ("a<b");
        }
    }
}

