package jour01.job11;

import java.util.Scanner;

public class Deco {
    
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner nombre = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int yourNumber = nombre.nextInt();


        for (int i = 1; i <= yourNumber ; i++) {
            System.out.print(i + " ");
        }
        
    }
}
