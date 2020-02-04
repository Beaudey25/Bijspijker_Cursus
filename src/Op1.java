import java.applet.Applet;

public class Op1 extends Applet {

    public void init() {
        System.out.println("Java is Object Georiënteerd");
        System.out.println("Java is strongly typed");
        System.out.println("Java is geen JavaScript\n\n");

        System.out.println("Java is geweldig!");
        System.out.println("Java is geweldig!");
        System.out.println("Java is geweldig!");
        System.out.println("Java is geweldig!");
        System.out.println("Java is geweldig!\n\n");

        System.out.println("a\ta^2\ta^3\ta^4\n");
        System.out.println("1\t1\t1\t1\n");
        System.out.println("2\t4\t8\t16\n");
        System.out.println("3\t9\t27\t81\n");
        System.out.println("4\t16\t64\t256\n");

        System.out.println("");
        double teller = 7.5 * 6.5 - 4.5 * 3;
        double noemer = 47.5 * 5.5;
        double breuk = teller/noemer;
        System.out.println(breuk + "\n\n");


        int som = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        System.out.println(som);

        double pi = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);
        System.out.println(pi + "\n\n");

        double pie =  3.14159;
        double straal = 6.5;
        double opp = straal*straal*pie;
        double omtrek = 2*straal*pie;

        System.out.println(opp);
        System.out.println(omtrek + "\n\n");

        double lengte =  5.3;
        double breedte = 8.6;
        double oppervlakte = lengte*breedte;
        double omtrekk = 2* (lengte + breedte);

        System.out.println(oppervlakte);
        System.out.println(omtrekk);
    }
}
