package jour02.job09;

public class End {

    public static void main(String[] args) {
        int number = 1234;

        String numberString = Integer.toString(number);

        int firstDigit = Character.getNumericValue(numberString.charAt(0));


        int lastDigit = Character.getNumericValue(numberString.charAt(numberString.length() - 1));

        System.out.println("Le premier chiffre de " + number + " est : " + firstDigit);
        System.out.println("Le dernier chiffre de " + number + " est : " + lastDigit);
    }
}
