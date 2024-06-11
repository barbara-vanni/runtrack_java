package jour02.job12;

public class De {

        public static void main(String[] args) {
            int totalCombinations = 0;
    
            System.out.println("Combinaisons possibles avec trois dés :");
    
            for (int i = 1; i <= 6; i++) {
                for (int j = 1; j <= 6; j++) {
                    for (int k = 1; k <= 6; k++) {
                        System.out.println("N° "+ (totalCombinations + 1) + " (" + i + ", " + j + ", " + k + ")");
                        totalCombinations++; 
                    }
                }
            }
    
            System.out.println("Nombre total de combinaisons : " + totalCombinations);
        }
}
