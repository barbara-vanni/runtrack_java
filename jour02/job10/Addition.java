package jour02.job10;

public class Addition {
    
    public static void main(String[] args) {
        int number = 1234;
        int somme = 0;

        String numberString = Integer.toString(number);

        for (int i = 0; i < numberString.length(); i++) {
            somme += Character.getNumericValue(numberString.charAt(i));
        }

        System.out.println("L'addition des chiffres de' " + number + " est : " + somme);
    }
}
