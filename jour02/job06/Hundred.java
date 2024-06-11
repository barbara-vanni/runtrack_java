package jour02.job06;

public class Hundred {
    
    public static void main(String[] args) {

        int nbpair = 0;

        for (int i = 0; i <= 100; i++) {
            if (i%2 == 0){
                nbpair += i;
            }
        }

        System.out.println("La somme des nombre pair de 0 à 100 est " + nbpair );
    }
}
