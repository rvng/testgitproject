/**
 * Created by razvanb on 06.06.2017.
 */
public class IntercalateTwoStrings {

    public static void main(String[] args) {
        String s1 = "12345678";
        String s2 = "abcd";
        IntercalateTwoStrings is = new IntercalateTwoStrings();
        System.out.println(is.intercalateStrings(s1,s2));
    }

    private String intercalateStrings(String s1, String s2) {
        int minLength  = 0;
        String restStr = "";
        if(s1.length()<s2.length()) {
            minLength = s1.length();
            restStr = s2.substring(minLength);
        }
        else if(s2.length()<s1.length()) {
            minLength = s2.length();
            restStr = s1.substring(minLength);
        }

        StringBuilder sb = new StringBuilder();
        if(s1.length()!=s2.length()) {
            for(int i=0;i<minLength;i++) {
                sb.append(s1.charAt(i)).append(s2.charAt(i));
            }
            sb.append(restStr);
        }
        else {
            for(int i = 0; i<s1.length(); i++){
                sb.append(s1.charAt(i)).append(s2.charAt(i));
            }
        }
        return sb.toString();
    }
}
