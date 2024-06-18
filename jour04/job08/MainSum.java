package jour04.job08;

import java.util.ArrayList;
import java.util.List;

public class MainSum {
    public static void main(String[] args) {
        int maxNumber = 10_000_000;
        int numThreads = 10;
        int range = maxNumber / numThreads;
        
        List<SumThread> sumThreads = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numThreads; i++) {
            int start = i * range + 1;
            int end = (i + 1) * range;
            SumThread sumThread = new SumThread(start, end);
            sumThreads.add(sumThread);
            Thread thread = new Thread(sumThread);
            threads.add(thread);
            thread.start();
        }

        long totalSum = 0;

        for (int i = 0; i < threads.size(); i++) {
            try {
                threads.get(i).join();
                totalSum += sumThreads.get(i).getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("La somme totale est: " + totalSum);
        System.out.println("Le temps d'exécution du programme est: " + executionTime + " ms");

        for (int i = 0; i < sumThreads.size(); i++) {
            System.out.println("Le temps d'exécution du thread " + (i + 1) + " est: " + sumThreads.get(i).getExecutionTime() + " ms");
        }
    }
}

