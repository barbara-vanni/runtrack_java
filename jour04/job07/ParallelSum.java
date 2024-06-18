package jour04.job07;

import java.util.Scanner;

public class ParallelSum {

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

        int mid = size / 2;

        long startTime = System.currentTimeMillis();

        SumThread sumThread1 = new SumThread(numbers, 0, mid);
        SumThread sumThread2 = new SumThread(numbers, mid, size);

        Thread thread1 = new Thread(sumThread1);
        Thread thread2 = new Thread(sumThread2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = sumThread1.getSum() + sumThread2.getSum();

        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;

        System.out.println("La somme totale est: " + totalSum);
        System.out.println("Le temps d'exécution du programme est: " + executionTime + " ms");
        System.out.println("Le temps d'exécution du thread 1 est: " + sumThread1.getExecutionTime() + " ms");
        System.out.println("Le temps d'exécution du thread 2 est: " + sumThread2.getExecutionTime() + " ms");
    }
}
