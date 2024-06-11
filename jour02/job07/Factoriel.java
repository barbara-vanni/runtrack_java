package jour02.job07;

import java.util.Scanner;

public class Factoriel {
    
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        int number = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factoriel de " + number + " est " + fact);
    }
}
