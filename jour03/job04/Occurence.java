package jour03.job04;

public class Occurence {
    public static void main(String[] args) {

        int[] array = {3, 7, 3, 9, 8};

        int max = 0;
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }

        int[] occurrences = new int[max + 1];

        for (int number : array) {
            occurrences[number]++;
        }

        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] > 0) {
                System.out.println("Nombre " + i + " : " + occurrences[i] + " occurrence(s)");
            }
        }
    }
}
