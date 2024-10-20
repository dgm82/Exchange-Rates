import java.util.Scanner;

import static java.lang.System.out;

public class CalkConverter {



    public void translate () {
        Scanner sc = new Scanner(System.in);

        out.println("Options: ");
        out.println("Enter 1: Usd");
        out.println("Enter 2: Yuan");
        out.println("Enter 3: Euro");
        out.println("Enter 4: Pln");
        out.println("Enter 5: Gbp");
        out.print("Choose your option: ");
        int choice = sc.nextInt();


     switch(choice) {

        case 1:
            out.print("Enter the amount you want to convert: ");
            double usd = sc.nextDouble();
            if (usd >= 0) {
                out.println(usd + " USD = " + usd * 0.92 + " Euro");
            } else {
                out.println("Please put in positive of USD");
            }
            break;

         case 2:
             System.out.print("Enter the amount you want to convert: ");
             double yuan = sc.nextDouble();
             if (yuan >= 0) {
                 out.println(yuan + " Yuan = " + yuan * 0.14 + " Euro");
             } else {
                 out.println("Please put in positive of USD");
             }
             break;

         case 3:
             System.out.print("Enter the amount you want to convert: ");
             double euro = sc.nextDouble();
             if (euro >= 0) {
                 out.println(euro + " Euro = " + euro * 1.09 + " USD");
             } else {
                 out.println("Please put in positive of USD");
             }
             break;

         case 4:
             System.out.print("Enter the amount you want to convert: ");
             double pln = sc.nextDouble();
             if (pln >= 0) {
                 out.println(pln + " Euro = " + pln * 0.25 + " USD");
             } else {
                 out.println("Please put in positive of USD");
             }
             break;

         case 5:
             System.out.print("Enter the amount you want to convert: ");
             double gbp = sc.nextDouble();
             if (gbp >= 0) {
                 out.println(gbp + " Euro = " + gbp * 1.31 + " USD");
             } else {
                 out.println("Please put in positive of USD");
             }
             break;
     }
}}