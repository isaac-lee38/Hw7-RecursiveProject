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

class waysToClimb {
    @Test
    public void testWaysToClimb1() {
        int expected = 5;
        int actual = RecursivePractice.waysToClimb(4);
        assertEquals(expected, actual);
    }
    @Test
    public void testWaysToClimb2() {
        int expected = 1;
        int actual = RecursivePractice.waysToClimb(1);
        assertEquals(expected, actual);
    }
    @Test
    public void testWaysToClimb3() {
        int expected = 2;
        int actual = RecursivePractice.waysToClimb(2);
        assertEquals(expected, actual);
    }
}
class permutation {
    @Test
    public void permutation1() {
        double expected = 840.00000;
        double actual = RecursivePractice.permutation(7,4);
        assertEquals(expected, actual);
    }
    @Test
    public void permutation2() {
        double expected = 20.00000;
        double actual = RecursivePractice.permutation(5,2);
        assertEquals(expected, actual);
    }
    @Test
    public void permutation3() {
        double expected = 1.00000;
        double actual = RecursivePractice.permutation(7,0);
        assertEquals(expected, actual);
    }
    @Test
    public void permutation4() {
        int n=-1,r=-10;
        assertThrows(IllegalArgumentException.class,() -> RecursivePractice.permutation(n,r));
    }
}
class findSecondLargest {

    @Test
    public void findSecondLargest1() {
        int[] test1 ={7, 1, 7};
        int expected = 7;
        int actual = RecursivePractice.findSecondLargest(test1);
        assertEquals(expected, actual);
    }
    @Test
    public void findSecondLargest2() {
        int[] test1 ={2,5,8,9,10};
        int expected = 9;
        int actual = RecursivePractice.findSecondLargest(test1);
        assertEquals(expected, actual);
    }
    @Test
    public void findSecondLargest3() {
        int[] test1 ={1,2,3,4,5,6,7,8,9};
        int expected = 8;
        int actual = RecursivePractice.findSecondLargest(test1);
        assertEquals(expected, actual);
    }
}