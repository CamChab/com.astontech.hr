package common.helpers;

public class CharHelper {
    public static String backwardsChars(CharSequence charSeq){
        String newString = new String();
        for(int i=charSeq.length()-1;i>=0;i--)
            newString += charSeq.charAt(i);
        return newString;
    }
}
