public class TwoPointer {

    //392. Is Subsequence
        public static boolean isSubsequence(String s, String t) {
            int sp = 0;
            int tp = 0;

            while (sp < s.length() && tp < t.length()) {
                if (s.charAt(sp) == t.charAt(tp)) {
                    sp++;
                }
                tp++;
            }

            return sp == s.length();
        }

    public static void main(String[] args){
            String s = "abc";
            String t = "ahgfbhyc";
        System.out.println(isSubsequence(s,t));
    }
}
