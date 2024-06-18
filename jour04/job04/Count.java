package jour04.job04;

import java.util.Scanner;

public class Count {

    public static void main(String[] args) {

        Scanner max = new Scanner(System.in);
        System.out.println("Saisir un nombre maximum à compter : ");
        int maxNumber = max.nextInt();
        max.close();

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= maxNumber; i++) {
            System.out.println(i);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Durée d'exécution : " + duration + "ms");
    }


    
}
