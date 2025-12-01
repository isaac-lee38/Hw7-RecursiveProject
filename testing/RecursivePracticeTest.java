import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CountSubstring {
    @Test
    public void testCountSubstrings1() {
        String text="abcabcabc";
        String dict="abc";
        int expected = 3;
        int actual = RecursivePractice.countSubstrings(text,dict);
        assertEquals(expected,actual);
    }
    @Test
    public void testCountSubstrings2() {
        String text="ab";
        String dict="abc";
        int expected = 0;
        int actual = RecursivePractice.countSubstrings(text,dict);
        assertEquals(expected,actual);
    }
    @Test
    public void testCountSubstrings3() {
        String text="abswerwerwerwrwerwerwerewrwerwrewrwerwerwrwerweabs";
        String dict="abs";
        int expected = 2;
        int actual = RecursivePractice.countSubstrings(text,dict);
        assertEquals(expected,actual);
    }
}

class multiplyOdds {
    @Test
    public void testMultiplyOdds1() {
        int n=4;
        int expected = 105;
        int actual = RecursivePractice.multiplyOdds(n);
        assertEquals(expected,actual);
    }
    @Test
    public void testMultiplyOdds2() {
        int n=10;
        int expected = 654729075;
        int actual = RecursivePractice.multiplyOdds(n);
        assertEquals(expected,actual);
    }
    @Test
    public void testMultiplyOdds3() {
        int n=-1;
        //int expected = 105;
        //int actual = RecursivePractice.multiplyOdds(n);
        //() -> RecursivePractice.multiplyOdds(n) calls a method, and inside that method the exception is thrown.
        assertThrows(IllegalArgumentException.class,() -> RecursivePractice.multiplyOdds(n));
    }
}

class digitMatch {
    @Test
    public void testDigitMatch1() {
        int expected = 4;
        int actual = RecursivePractice.digitMatch(1072503891,62530841);
        assertEquals(expected, actual);
    }
    @Test
    public void testDigitMatch2() {
        int expected = 2;
        int actual = RecursivePractice.digitMatch(110,10);
        assertEquals(expected, actual);
    }
    @Test
    public void testDigitMatch3() {
        int expected = 3;
        int actual = RecursivePractice.digitMatch(1000000010,1010);
        assertEquals(expected, actual);
    }
}