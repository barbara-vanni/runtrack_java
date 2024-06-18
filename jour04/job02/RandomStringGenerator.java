package jour04.job02;

import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class RandomStringGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la longueur de la chaine de caractère : ");
        int length = scanner.nextInt();
        scanner.close();

        long startTime = System.currentTimeMillis();

        String randomString = generateRandomString(length);

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(randomString);
        } catch (IOException e) {
            System.out.println("Une erreur s'est produite lors de l'écriture du fichier.");
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;
        System.out.println("Le temps d'exécution du programme est : " + executionTime + " ms");
    }
    
    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        return sb.toString();
    }

}

    

