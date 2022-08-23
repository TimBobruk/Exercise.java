import java.util.Scanner;
import java.util.Random;

public class main {

    private static final char A = 97;
    private static final char Z = 122;
    public static void main (String args[]){
            int A = 97;
            int Z = 122;
            int symbol = generate(A, Z);
            int i = 0;
            while (i != symbol) {
                System.out.println("Вгадайте загадану літеру: ");
                Scanner inputs = new Scanner(System.in);
                char InputInformation = read();;
                if (!LatinLetter(InputInformation)) {
                    System.out.println("Reread rules!");
                }
                else if (symbol < InputInformation) {
                    System.out.println("Too High");
                }
                else if (symbol > InputInformation){
                    System.out.println("Too low");
                }
                   else if (InputInformation==symbol){
                        System.out.println("Вітаю ви вгадали загадана літера"+" "+InputInformation);
                        System.out.println("Кількість спроб"+" "+i);
                        break;
                    }
                i++;
            }

        }
    private static int generate(int min, int max) {
        Random RandomSymbol = new Random();
        return RandomSymbol.nextInt((max - min) + 1) + min;
    }
    private static boolean LatinLetter(char a) {
        return (a >= A && a <= Z);
    }
    private static char read() {
        Scanner s = new Scanner(System.in);
        return Character.toLowerCase(s.next().charAt(0));

    }
        }
