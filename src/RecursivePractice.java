import java.util.Arrays;
import java.util.PriorityQueue;

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

    public static int digitMatch(int x, int y){
        return digitMatchHelper(x,y);
    }

    private static int digitMatchHelper (int a, int b){
        if (a==0 || b==0){
            return 0;
        }
        int res=0;
        if (a%10 == b%10){
            res=1;
        }
        return res + digitMatchHelper(a/10,b/10);
    }

    public static int waysToClimb(int n){
        if (n<0) throw new IllegalArgumentException("n must be >= 0");
        int[] memo= new int[n+1];
        Arrays.fill(memo, -1);
        return waysToClimbHelper(n,memo);
    }
    private static int waysToClimbHelper(int n, int[] memo){
        if (n==0) return 1;
        if (n==1) return 1;

        if (memo[n]!=-1) return memo[n];

        memo[n]= waysToClimbHelper(n-1,memo) + waysToClimbHelper(n-2,memo);
        return memo[n];
    }

    public static double permutation(int n, int r){
        if (n<r||n<0||r<0) throw new IllegalArgumentException("n must be >= 0");
        return permutationHelper(1,n,n-r);
    }

    private static double permutationHelper(int product,int cur, int lowerLimit){
        if (cur==lowerLimit) return product;
        product*=cur;
        return permutationHelper(product,cur-1,lowerLimit);
    }

    public static int findSecondLargest(int[] arr){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        //Priority Queue is default min heap, flip the sign and flip back
        for (int num:arr){
            heap.add(-num);
        }
        return findSecondLargestHelper(heap,1,2);
    }

    private static int findSecondLargestHelper(PriorityQueue<Integer> heap, int cur, int limit){
        if (cur==limit) return -heap.poll();
        heap.poll();
        return findSecondLargestHelper(heap,cur+1,limit);
    }

    public static void main(String[] args) {
        System.out.printf("%d\n", countSubstrings("abcabcabc","abc"));
        System.out.printf("%d\n", multiplyOdds(10));
        System.out.printf("%d\n", digitMatch(1072503891, 62530841));
        int[] arr = {5, 2, 8, 7};
        System.out.printf("%d\n", findSecondLargest(arr));
        System.out.printf("%f\n", permutation(7, 4));
        System.out.printf("%d\n", waysToClimb(4));
    }
}
