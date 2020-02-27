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


    }
}
