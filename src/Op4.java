import com.sun.deploy.security.SelectableSecurityManager;
import sun.text.normalizer.UCharacter;

import java.util.Scanner;

public class Op4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Van welk karFakter wil je de ASCII waarde weten?");
        char userinput = scanner.nextLine().charAt(0);
        int waarde = (int) userinput;
        System.out.println("De ASCII waarde van het karakter " + userinput + " is " + waarde + "");


        System.out.println("Van welk karakter wil je weten of het een getal of letter is?");
        userinput = scanner.nextLine().charAt(0);
        if (Character.isLetter(userinput)) {
            System.out.println("De " + userinput + " is een letter");
        } else if (Character.isDigit(userinput)) {
            System.out.println("De " + userinput + " is een getal.");
        } else {
            System.out.println("De " + userinput + " is geen letter en ook geen gertal");
        }


        System.out.println("Van welk karakter wil je weten of het een getal of letter is?");
        userinput = scanner.nextLine().toLowerCase().charAt(0);
        if (userinput == 'a' || userinput == 'e' || userinput == 'i' || userinput == 'u' || userinput == 'o') {
            System.out.println("De " + userinput + " is een klinker");
        } else {
            System.out.println("De " + userinput + " is een medeklinker");
        }


        System.out.println("Van welke letter wil je het nummer weten?");
        userinput = scanner.nextLine().toLowerCase().charAt(0);
        if (userinput == 'a' || userinput == 'b' || userinput == 'c' ) {
            System.out.println("De " + userinput + " staat op nummer 2");
        } else if (userinput == 'd' || userinput == 'e' || userinput == 'f') {
            System.out.println("De " + userinput + " staat op nummer 3");
        } else if (userinput == 'g' || userinput == 'h' || userinput == 'i') {
        System.out.println("De " + userinput + " staat op nummer 4");
        } else if (userinput == 'j' || userinput == 'k' || userinput == 'l') {
            System.out.println("De " + userinput + " staat op nummer 5");
        } else if (userinput == 'm' || userinput == 'n' || userinput == 'o') {
            System.out.println("De " + userinput + " staat op nummer 6");
        } else if (userinput == 'p' || userinput == 'q' || userinput == 'r' || userinput == 's') {
            System.out.println("De " + userinput + " staat op nummer 7");
        } else if (userinput == 't' || userinput == 'u' || userinput == 'v') {
            System.out.println("De " + userinput + " staat op nummer 8");
        } else if (userinput == 'w' || userinput == 'x' || userinput == 'y' || userinput == 'z') {
            System.out.println("De " + userinput + " staat op nummer 9");
        }


    }
}

