import java.util.*;

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
    }

    private int nextOf(int c) {
        Iterator<Map.Entry<Character, Integer>> iterator = romanArabicPairs.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() == c && iterator.hasNext())
                return iterator.next().getValue();
            else
                return c;
        }
        return 0;
    }


    public int convertRomanToArabic(String romanNumber) {
        int result = 0;
        if (romanNumber == null || romanNumber.isEmpty()) return result;
        if (romanNumber.matches("[MDCLXVI]") == false)
            throw new IllegalArgumentException("[M D C L X V I] chars are the only allowed chars");
        for (int i = romanNumber.length() - 1; i > 0; i--) {
            int current = romanArabicPairs.get(romanNumber.charAt(i));
            int previous = romanArabicPairs.get(romanNumber.charAt(i - 1));
            if (result > current && result + current >= nextOf(current)) throw new IllegalArgumentException();
            if (previous < current) {
                if (previous == current / 5 || previous == current / 10) {
                    result += current - previous;
                    i--;
                } else

            }

            return result;
        }
    }
