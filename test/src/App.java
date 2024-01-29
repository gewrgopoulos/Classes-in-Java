import Car.car;
import SiteReview.siteapplication;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        siteapplication siteobjetcx= new siteapplication();
        
        Scanner key=new Scanner(System.in);

        car Car1 = new car("Mercendes",2023,1500);
        car Car2= new car("BMW",2024,1600);
        
        System.out.println(Car1.model+" "+ Car1.year +" "+ Car1.cc);
        System.out.println("Rate this car 1-5");
        Car1.ans_review=key.nextInt();
        
        while (Car1.ans_review<1 || Car1.ans_review>5) {
            System.out.println("Give a valid rate.");
            Car1.ans_review=key.nextInt();
        }
        if(Car1.ans_review<2.5) {
            Car1.review="Bad review";
        }else if(Car1.ans_review>2.5 && Car1.ans_review<5) {
            Car1.review="Average review";
        }else {
            Car1.review="Good review";
        }
            System.out.println("Your review: "+Car1.review);
            

            System.out.println(Car2.model+" "+ Car2.year +" "+ Car2.cc);
            System.out.println("Rate this car 1-5");
            Car2.ans_review=key.nextInt();
            while (Car2.ans_review<1 || Car2.ans_review>5) {
                System.out.println("Give a valid review");
                Car2.ans_review=key.nextInt();
            }
            if(Car2.ans_review<2.5) {
                Car2.review="Bad review";
            }else if(Car2.ans_review>2.5 && Car2.ans_review<5) {
                Car2.review="Average review";
            }else {
                Car2.review="Good review";
            }
                System.out.println("Your review: "+Car2.review);

            if(Car1.ans_review>Car2.ans_review){
                System.out.println("You chose "+Car1.model+"over "+Car2.model);
            }else if(Car1.ans_review < Car2.ans_review){
                System.out.println("You chose "+Car2.model+"over "+Car1.model);
            }else{
                System.out.println(Car1.model+" is same as "+Car2.model);
            }
            siteobjetcx.Sitemain();

    }
}
