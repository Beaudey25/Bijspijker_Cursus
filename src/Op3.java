import java.util.Scanner;

public class Op3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int random = (int) (Math.random() * 10 + 1);
        int random2 = (int) (Math.random() * 10 + 1);

        System.out.print("Hoeveel is " + random + " + " + random2 + "? ");
        int userinput = scanner.nextInt();
        int uitkomst = random + random2;
        if (userinput == uitkomst) {
            System.out.println("Klopt");
        } else {
            System.out.println("Helaas het juiste antwoord was " + uitkomst + ".");
        }


        int randomm1 = (int) (Math.random() * 10 + 1);
        int randomm2 = (int) (Math.random() * 10 + 1);
        int randomm3 = (int) (Math.random() * 10 + 1);

        System.out.print("Hoeveel is " + randomm1 + " * " + randomm2 + " * " + randomm3 + "? ");
        int userinputt = scanner.nextInt();
        int uitkomstt = randomm1 * randomm2 * randomm3;

        if (userinputt == uitkomstt) {
            System.out.println("Klopt");
        } else {
            System.out.println("Helaas het juiste antwoord is " + uitkomstt + "");
        }


        int randomgetal = (int) (Math.random() * 12 + 1);
        String maand = "onbekend";
        switch (randomgetal) {
            case 1:
                maand = "januari";
                break;
            case 2:
                maand = "febrauri";
                break;
            case 3:
                maand = "maart";
                break;
            case 4:
                maand = "april";
                break;
            case 5:
                maand = "mei";
                break;
            case 6:
                maand = "juni";
                break;
            case 7:
                maand = "juli";
                break;
            case 8:
                maand = "augustus";
                break;
            case 9:
                maand = "september";
                break;
            case 10:
                maand = "oktober";
                break;
            case 11:
                maand = "november";
                break;
            case 12:
                maand = "december";
                break;
        }
        System.out.println("Het getal " + randomgetal + " is de maand: " + maand + "");


        System.out.println("Welke weekdag is het nu? ( 1 = ma / 2 = di / 3 = wo / 4 = do / 5 = vr / 6 = za / 7 = zo ");
        int weekdag = scanner.nextInt();
        System.out.println("En van hoeveel dagen in de toekomst wil je de weekdag berekenen?");
        int dagenvooruit = scanner.nextInt();
        int resultaat = weekdag + dagenvooruit;
        if (resultaat > 7) ; {
            resultaat = resultaat % 7;
            String[] weekdagen = {"Onbekend","Maandag","Disndag","Woensdag","Donerdag","Vrijdag","Zaterdag","Zondag"};
            System.out.println("Vandaag is het " +  weekdagen[weekdag] + " en over " +  dagenvooruit + " is het " +  weekdagen[resultaat] + "");
        }


        System.out.println("Wat is uw gewicht (kg) ?");
        int gewicht = scanner.nextInt();
        System.out.println("Wat is uw lengte (m) ?");
        double lengte = scanner.nextDouble();
        double lengteresultaat = lengte*lengte;
        double resultaatBMI = gewicht / lengteresultaat;


        System.out.println("Uw BMI is " +  resultaatBMI + "");

    }
}


