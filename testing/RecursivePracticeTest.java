import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class TRecursiveTest {
    @Test
    public void testCountSubstrings() {
        String text="abcabcabc";
        String dict="abc";
        int expected = 3;
        int actual = RecursivePractice.countSubstrings(text,dict);
        assertEquals(expected,actual);
    }
}