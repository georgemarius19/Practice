import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToArabic implements RomanToArabicConverter {

    private static Map<Character, Integer> romanArabicPairs = new LinkedHashMap<>();

    static {
        romanArabicPairs.put('M', 1000);
        romanArabicPairs.put('D', 500);
        romanArabicPairs.put('C', 100);
        romanArabicPairs.put('L', 50);
        romanArabicPairs.put('X', 10);
        romanArabicPairs.put('V', 5);
        romanArabicPairs.put('I', 1);

        romanArabicPairs.
    }

    public int convertRomanToArabic(String romanNumber) {
        int result = 0;
        if (romanNumber == null || romanNumber.isEmpty()) return result;
        if (romanNumber.matches("[MDCLXVI]") == false)
            throw new IllegalArgumentException("[M D C L X V I] chars are the only allowed chars");
        for (int i = romanNumber.length() - 1; i > 0; i--) {
            int current = romanArabicPairs.get(romanNumber.charAt(i));
            int previous = romanArabicPairs.get(romanNumber.charAt(i - 1));
            int previous = romanArabicPairs.get(romanNumber.charAt(i - 1));

            if (current  result) throw new IllegalArgumentException();
            if (previous < current) {
                if (previous == current / 5 || previous == current / 10) {
                    result += current - previous;
                    i--;
                }
                else

            }

            return result;
        }
    }
