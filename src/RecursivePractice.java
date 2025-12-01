public class RecursivePractice {

    public static int countSubstrings(String word, String substring){
        int exist=0;
        if(word == null || substring == null || word.length() < substring.length()){
            return 0;
        }
        String tmp = word.substring(0,substring.length());
        if (tmp.compareTo(substring)==0){
            exist=1;
        }
        return exist + countSubstrings(word.substring(1),substring);
    }
    public static int multiplyOdds(int n){
        if (n<=0){
            throw new IllegalArgumentException("N less than or equal to 0.\n");
        }
        return multiplyOddsHelper(1,1,n);
    }
    //Helper function for multiOdds
    private static int multiplyOddsHelper (int product, int cur, int limit){
        if (cur>limit){
            return product;
        }
        product = product * (2*cur-1);
        return multiplyOddsHelper(product,cur+1,limit);
    }


    public static void main(String[] args) {
        System.out.printf("%d\n", countSubstrings("abcabcabc","abc"));
        System.out.printf("%d\n", multiplyOdds(10));
    }
}
