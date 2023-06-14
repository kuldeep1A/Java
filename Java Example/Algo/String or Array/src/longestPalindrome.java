package src;

public class longestPalindrome {
    public static String longestPalindrome1(String s){
        final String t = join("@" + s + "$");
        return t;
    }
    private static String join(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            sb.append(s.charAt(i));
            if (i != s.length() - 1){
                sb.append('#');
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome1(""));
    }
}
