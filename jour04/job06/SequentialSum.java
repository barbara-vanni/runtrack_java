package jour04.job06;

import java.util.Scanner;

public class SequentialSum {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la taille du tableau: ");
        int size = scanner.nextInt();


        int[] numbers = new int[size];

        System.out.println("Entrez les nombres du tableau: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();


        long startTime = System.currentTimeMillis();


        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }


        long endTime = System.currentTimeMillis();


        long executionTime = endTime - startTime;

        System.out.println("La somme totale est: " + sum);
        System.out.println("Le temps d'exécution du programme est: " + executionTime + " ms");
    }
}

