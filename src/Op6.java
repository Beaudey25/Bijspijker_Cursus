import java.util.Scanner;

public class Op6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        prinzinnetje();
        String userinpit;
        int getal1;
        int getal2;
        int product;


        System.out.println("Welk zinnetje wilt u printen? ");
        userinpit = scanner.nextLine();
        prinzinnetje(userinpit);


        getal1 = (int) (Math.random()*10 +1);
        getal2 = (int) (Math.random()*10 +1);
        product = berekenProduct(getal1, getal2);
        System.out.println("Het product van " + getal1 + " en " + getal2 + " is " + product + "" );


        System.out.println("We gaan twee getallen vermenigvuldigen.");
        getal1 = scanner.nextInt();
        System.out.println("Wat is het eerste getal?");
        getal2 = scanner.nextInt();
        product = 1;
    berekenProduct(getal1, getal2);
        System.out.println("Het product van " + getal1 + " en " + getal2 + " is " + product + "" );



    }

    public static void prinzinnetje() {
        System.out.println("Hello world");
    }

    public static void prinzinnetje(String zinnetje) {
        System.out.print(zinnetje);
    }
    public static int berekenProduct(int getal1, int getal2) {

        return getal1 * getal2;
    }
}
