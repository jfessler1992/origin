package Roman_Numeral;

import java.util.Scanner;

public class RomanNumeralApp {

	public static void main(String[] args) {
        // create the Scanner object
        Scanner sc = new Scanner(System.in);

        // continue until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(sc.nextLine());
            System.out.println();
            RomanNumeral myrn = new RomanNumeral();
            String romanResult = myrn.convertNumberToNumeral(number);
            System.out.println("Number "+number + " is "+romanResult);
            	System.out.print("Display another number? (y/n): ");
            
            	choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
    }

}
