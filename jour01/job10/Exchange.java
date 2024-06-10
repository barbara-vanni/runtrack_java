package jour01.job10;

public class Exchange {
    
    public static void main(String[] args) {
        String chaine1 = "Coucou";
        String chaine2 = "uocuoC";

        System.out.println("chaine1: " + chaine1 + " chaine2: " + chaine2);

        chaine2 = new String(chaine1);
        chaine1 = "uocuoC";

        System.out.println("chaine1: " + chaine1 + " chaine2: " + chaine2);


    }
}
