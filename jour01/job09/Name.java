package jour01.job09;

import java.util.Scanner;

public class Name {
    
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String yourName = name.nextLine();   
        
        System.out.println("Enter your surname: ");

        String yourSurname = name.nextLine();


        System.out.println("Hello " + yourName + " " + yourSurname+ "!");
    }
}
