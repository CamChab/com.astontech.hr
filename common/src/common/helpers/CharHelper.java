package common.helpers;

public class CharHelper implements CharSequence{
    private String S;

    public CharHelper(){}
    public CharHelper(String s){
        setS(s);
    }
    public String getS() {
        return S;
    }

    public void setS(String s) {
        S = s;
    }

    public String backwards(){
        String newString = new String();
        for(int i = getS().length()-1; i>=0; i--)
            newString += getS().charAt(i);
        return newString;
    }

    @Override
    public int length() {
        return getS().length();
    }

    @Override
    public char charAt(int i) {
        return getS().charAt(i);
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        String newString ="";
        for(int a=i;a<=i1;a++)
            newString += getS().charAt(a);
        return newString;
    }


}
