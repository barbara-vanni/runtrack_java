package jour03.job01;

import java.util.Arrays;

public class Array {
    
    public static void main(String[] args) {
        int[] tableau = new int[5];
        tableau[0] = 10;
        tableau[2] = 2;
        tableau[4] = 69;

        System.out.println(Arrays.toString(tableau));
        System.out.print("Index 1 : "+ tableau[1]);
    }
}
