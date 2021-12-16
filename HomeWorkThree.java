/**
* Java 1. Homework #3
*
* @author Natalia Erokhova
* @version 16.12.2021
*/

import java.util.Arrays;

class HomeWorkThree {
    public static void main (String[] args) {
        replaceNum ();
        fillArr ();
        multiply ();
        fillDiag ();
        System.out.println(accept (5, 10));
    }
    
    static void replaceNum () {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr [i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    System.out.println(Arrays.toString(arr));
    }
    
    static void fillArr () {
        int[] arrey = new int[100];
        for (int i = 0; i < arrey.length; i++) {
            arrey[i] = i + 1;
        }
    System.out.println(Arrays.toString(arrey));
    }
    
    static void multiply () {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    System.out.println(Arrays.toString(arr));
    }
    
    static void fillDiag () {
        int[][] diag = new int[6][6];
        for (int i = 0; i < diag.length; i++) {
            for (int j = 0; j < diag[i].length; j++) {
                if (i == j) {
                    diag[i][j] = 1;
                }
            }
        }
    System.out.println(Arrays.toString(diag));
    }
    
    static int[] accept (int len, int initialValue) {
        int[] mas = new int[len];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = initialValue;
        }
        return mas;
    }
}