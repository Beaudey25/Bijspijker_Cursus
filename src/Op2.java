import java.applet.Applet;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Op2 extends Applet {


   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.print("Typ hier het aantal mijlem: ");
       double mijlen = scanner.nextDouble();
       double kilometers = mijlen * 1.6;
       int tussenstap = (int) (kilometers *10);
       kilometers = tussenstap / 10.;
       System.out.println(mijlen + " mijlen is " + kilometers + " kilometers ");


       System.out.print("Hoe oud ben je? ");
       int leeftijdInJ = scanner.nextInt();
       System.out.print("Hoeveel maanden komen daar nog bij? ");
       int leeftijdInMa = scanner.nextInt();
       int leeftijdinMi = leeftijdInJ *365 * 24 *60 + leeftijdInMa *30 *24 *60;
       System.out.println("Je bent dan " + leeftijdinMi + " oud.");


       System.out.print("Wat is het startbedrag: ");
       double startbedrag = scanner.nextDouble();
       System.out.print("Wat is het rentepercentage: ");
       double rentepercentage = scanner.nextDouble();
       double rente = rentepercentage / 100 * startbedrag;
       double totaal = startbedrag + rente;
       System.out.println("De rente is " + rente + " En het totaal bedrag is " + totaal + "");


       System.out.print("Noem een getal tussen de 10 en de 100: ");
       int userinput = scanner.nextInt();
       int buurman1 = userinput - 2;
       int buurman2 = userinput - 1;
       int buurman3 = userinput + 1;
       int buurman4 = userinput + 2;
       System.out.println("De 5 getallen zijn " + buurman1 + "-" + buurman2 + "-" + buurman3 + "-" + buurman4 + "");

       }
    }


