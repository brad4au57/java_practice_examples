package madlibs;

import java.util.Scanner;

public class MadLibGenerator {

    public static void main(String[] args){
        // 1. Get a season
        System.out.println("Please enter a season of the year.");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // 2. Get a whole number
        System.out.println("Please enter a whole number.");
        int wholeNum = scanner.nextInt();

        // 3. Get an adjective
        System.out.println("Please enter a descriptive adjective.");
        String adj = scanner.next();
        scanner.close();

        // 4. Output the result as a madlib sentence
        System.out.println("On a " + adj + " " + season + " day, I drink a minimum of of " + wholeNum + " cups of coffee.");

    }
}
