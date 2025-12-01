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

}
