package jour01.job07;

public class Facture {

    public static void main(String[] args) {
        float prix = 49.99f;
        int quantite = 3;
        float tarifHT; 
        float tva = 20;
        float tarifTTC;

        tarifHT = prix * quantite;
        tarifTTC = tarifHT + (tarifHT * tva / 100);

        System.out.println("Le montant total est : " + tarifHT );
        System.out.println("Le montant de la taxe est : " + (tarifTTC - tarifHT) );
        System.out.println("Le montant total à payer est : " + tarifTTC );


    }
    
}
