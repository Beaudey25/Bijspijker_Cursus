import java.util.Scanner;

public class Op5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean proceed = true;
        while (proceed) {
            System.out.print("Wat is je toetscijfer?");
            double cijfer = scanner.nextDouble();
            if (cijfer == -1) {
                System.out.println("Joejoe");
                proceed = false;
                continue;
            } else if (cijfer >= 5.5) {
                System.out.println("JE hebt een voldoende");
            } else {
                System.out.println("Helaas je he bt een onvoldoende");
                break;
            }
        }

        int score = 0;
        for (int i = 0; i <10 ; i++) {

            int getal1 = (int) (Math.random() * 10 + 1);
            int getal2 = (int) (Math.random() * 10 + 1);
            int uitkomst = getal1 + getal2;
            System.out.println("Hoeveel is " + getal1 + "+" + getal2 + "?");
            int userinput = scanner.nextInt();
            if (userinput == uitkomst) {
                System.out.println("Dat klopt");
                score++;
            } else {
                System.out.println("Helaas het goede antwoord is " + uitkomst + ".");
            }
        }
        System.out.println("Je score is " + score + ".");


        for (int i = 0; i < 11; i++) {
            int xsom = i * 7;
            System.out.println(i + " x 7 = " + xsom + "");
        }

        int laagstenummer = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Typ hier een getal: ");
            int number = scanner.nextInt();
            if (i == 0) {
                laagstenummer = number;
            } else {
                if (number < laagstenummer) {
                    laagstenummer = number;
                }
            }
        }
        System.out.println("Het laagste getal is " + laagstenummer + "");





    }
}

