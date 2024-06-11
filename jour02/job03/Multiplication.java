package jour02.job03;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner nombre = new Scanner(System.in);
        System.out.print("Entrez un nombre à multiplier: ");

        String input = nombre.nextLine();

        int nombre1 = Integer.parseInt(input);

        for (int i = 1; i <= 9; i++) {
            

            System.out.println(input + " x " + i + " = " + (nombre1 * i));
        }

    }
    
}
