package jour02.job05;

import java.util.Scanner;

public class Age {
    
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner age = new Scanner(System.in);
        System.out.print("Entrez votre âge: ");

        String input = age.nextLine();

        int ageCheck = Integer.parseInt(input);

        if (ageCheck < 16) {
            System.out.println("Vous ne pouvez pas travailler.");
        } else if (ageCheck > 67) {
            System.out.println("Vous êtes à la retraite.");
        } else if (ageCheck > 55) {
            System.out.println("Vous commencez à être trop vieux pour travailler.");
        } else {
            System.out.println("Vous pouvez travailler.");
        }
    }
}
