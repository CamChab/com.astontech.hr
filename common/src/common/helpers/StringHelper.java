package common.helpers;

public class StringHelper {
    public StringHelper(){}

    public static boolean isNullOrEmpty(String s){
        return s == null || s.length() == 0;
    }
    public static int numberOfTokens(String s, char token){
        int count=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)==token)
                count++;
        return count;
    }
    public static String makeBackwards(String s){
        String newString = new String();
        for(int i=s.length()-1;i>=0;i--)
            newString += s.charAt(i);
        return newString;
    }

    public static String Interleave(String s1, String s2){
        String newString = new String();
        for(int i=0;i<s1.length()||i<s2.length();i++){
            if(i<s1.length())
                newString += s1.charAt(i);
            if(i<s2.length())
                newString += s2.charAt(i);
        }
        return newString;
    }

}
