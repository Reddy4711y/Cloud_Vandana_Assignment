import java.util.Scanner;

public class Pangram {
  public static boolean checkPangram(String sentence) {
        sentence = sentence.toLowerCase();

        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = checkPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    
}
