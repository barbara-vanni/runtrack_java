package jour03.job07;

public class Matrice {

    public static void main(String[] args) {
    
        int[][] matrice1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrice2 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("Valeurs de matrice1:");
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                System.out.print(matrice1[i][j] + " ");
            }
            System.out.println(); 
        }

    
        int[][] resultMatrice = new int[3][3];

        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                resultMatrice[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        System.out.println("Résultat de l'addition de matrice1 et matrice2:");
        for (int i = 0; i < resultMatrice.length; i++) {
            for (int j = 0; j < resultMatrice[i].length; j++) {
                System.out.print(resultMatrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
