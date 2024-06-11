package jour02.job08;

import java.util.Scanner;

public class Numero {
    
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        String input = scanner.nextLine();

        int count = 0;

        for (int i = 1; i <= input.length(); i++) {
            count ++;
        }

        System.out.println("Le nombre " + input + " a " + count + " chiffres.");

    }
}
