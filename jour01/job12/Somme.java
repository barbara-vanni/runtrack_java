package jour01.job12;

import java.util.Scanner;

public class Somme {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner somme = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int num1 = somme.nextInt();
        int num2 = somme.nextInt();


        System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2)); 



    }

    
}
