package jour03.job02;

import java.util.Arrays;

public class MonTableau {
    public static void main(String[] args){

        int [] monTableau = {12,6,76,89};
        System.out.println(Arrays.toString(monTableau));

        monTableau[2] = 10;
        monTableau[3] = 8;
        System.out.println(Arrays.toString(monTableau));

    }
    
}
