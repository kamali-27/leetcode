// Last updated: 8/14/2026, 4:06:26 PM
public class Solution {
    public static boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }

        return s.length() == 0;
    }
}

            
