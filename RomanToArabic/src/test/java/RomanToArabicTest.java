import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RomanToArabicTest {


    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowAnExceptionWhenTheStringContainIllegalCharacters(){
        RomanToArabicConverter x = new RomanToArabic();
        x.convertRomanToArabic("MCX");
    }
}