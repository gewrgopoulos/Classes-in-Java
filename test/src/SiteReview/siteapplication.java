package SiteReview;
import java.util.Scanner;
public class siteapplication {
    public static void Sitemain(){
        String user_answer = "";
        Scanner answer = new Scanner(System.in);

        while (!user_answer.equals("Y") && !user_answer.equals("N")) {
            System.out.println("Would you like to see some other projects? (Y or N)");
            user_answer = answer.nextLine().toUpperCase();
        }

        if (user_answer.equals("Y")) {
            System.out.println("Nice check this -> https://github.com/gewrgopoulos");
        } else {
            System.out.println("No problem m8 have a great day :)");
        }
        answer.close();
    }
}
