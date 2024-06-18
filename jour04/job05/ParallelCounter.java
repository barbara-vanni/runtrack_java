package jour04.job05;

import java.util.Scanner;

public class ParallelCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre maximum à compter: ");
        int maxNumber = scanner.nextInt();
        scanner.close();

        int midNumber = maxNumber / 2;

        long startTime = System.currentTimeMillis();

        CounterThread counter1 = new CounterThread(1, midNumber);
        CounterThread counter2 = new CounterThread(midNumber + 1, maxNumber);

        Thread thread1 = new Thread(counter1);
        Thread thread2 = new Thread(counter2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalCount = counter1.getCount() + counter2.getCount();

        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;

        System.out.println("Le compte total est: " + totalCount);
        System.out.println("Le temps d'exécution du programme est: " + executionTime + " ms");
        System.out.println("Le temps d'exécution du thread 1 est: " + counter1.getExecutionTime() + " ms");
        System.out.println("Le temps d'exécution du thread 2 est: " + counter2.getExecutionTime() + " ms");
    }
}
