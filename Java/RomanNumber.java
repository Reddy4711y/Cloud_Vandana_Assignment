import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class RomanNumber {

  public static int romanToInt(String str) {
        Map<Character, Integer> numerals = new HashMap<>();
        numerals.put('I', 1);
        numerals.put('V', 5);
        numerals.put('X', 10);
        numerals.put('L', 50);
        numerals.put('C', 100);
        numerals.put('D', 500);
        numerals.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            int curValue = numerals.get(str.charAt(i));

            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }

            prevValue = curValue;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Number : ");
        String romanNumeral = scanner.next().toUpperCase();

        int result = romanToInt(romanNumeral);
        System.out.println("Integer value: " + result);

        
    }

    
}
