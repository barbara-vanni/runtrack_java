package jour03.job03;

import java.util.Arrays;

public class StringArray {

    public static void main(String[] args) {
        String[] tableau = {"Josette", "John","Myrtille","Marc"};

        System.out.println("Tableau original : " + Arrays.toString(tableau));
        System.out.println("Index 1 : " + tableau[1]);

        tableau[2] = "Mireille";

        System.out.println("Tableau modifié : " + Arrays.toString(tableau));

    }
    
}
