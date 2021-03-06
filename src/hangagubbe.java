/*
Author Johan Jokijärvi
 */
import java.util.Scanner;
public class hangagubbe {
/*
Antal ord, samt hur orden fungerar
*/
    private static String[] words = {"Teknik", "banan", "dator", "hängagubbe", "polyetylentereftalat", "vatten" };
    private static String ord = words[(int) (Math.random() * words.length)];
    private static String asterisk = new String(new char[ord.length()]).replace("\0", "*");
    private static int gissning = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (gissning < 7 && asterisk.contains("*")) {
            System.out.println("Gissa en bokstav");
            System.out.println(asterisk);
            String guess = sc.next();
            hang(guess);
        }
        sc.close();

    }
/*
Hur gissningarna funkar
*/
    public static void hang(String guess) {
        String newasterisk = "";
        for (int i = 0; i < ord.length(); i++) {
            if (ord.charAt(i) == guess.charAt(0)) {
                newasterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != '*') {
                newasterisk += ord.charAt(i);
            } else {
                newasterisk += "*";
            }
        }

        if (asterisk.equals(newasterisk)) {
            gissning++;
            antalgissningar();
        } else {
            asterisk = newasterisk;
        }
        if (asterisk.equals(ord)) {
            System.out.println("Correct! You win! The word was " + ord);
        }
    }
/*
Antal gissningar
*/
    public static void antalgissningar() {
        if (gissning == 1) {
            System.out.println("____________");
            System.out.println("Fel gissning, du har 6 försök kvar");
        }
        if (gissning == 2) {
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("______|_____");
            System.out.println("Fel gissning, du har 5 försök kvar");
        }
        if (gissning == 3) {
            System.out.println("      __________");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("______|_____");
            System.out.println("Fel gissning, du har 4 försök kvar");
        }
        if (gissning == 4) {
            System.out.println("      __________");
            System.out.println("      |        |");
            System.out.println("      |        |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("______|_____");
            System.out.println("Fel gissning, du har 3 försök kvar");
        }
        if (gissning == 5) {
            System.out.println("      __________");
            System.out.println("      |        |");
            System.out.println("      |        |");
            System.out.println("      |       ---");
            System.out.println("      |      |0 0|");
            System.out.println("      |      \\__/");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("______|_____");
            System.out.println("Fel gissning, du har 2 försök kvar");
        }
        if (gissning == 6) {
            System.out.println("      __________");
            System.out.println("      |        |");
            System.out.println("      |        |");
            System.out.println("      |       ---");
            System.out.println("      |      |0 0|");
            System.out.println("      |      \\__/");
            System.out.println("      |       /|\\");
            System.out.println("      |");
            System.out.println("______|_____");
            System.out.println("Fel gissning, du har 1 försök kvar");
        }
        if (gissning == 7) {
            System.out.println("      __________");
            System.out.println("      |        |");
            System.out.println("      |        |");
            System.out.println("      |       ---");
            System.out.println("      |      |0 0|");
            System.out.println("      |      \\__/");
            System.out.println("      |       /|\\");
            System.out.println("      |       / \\");
            System.out.println("______|_____");
            System.out.println("GAME OVER! Ordet var " + ord);
        }
    }
}
