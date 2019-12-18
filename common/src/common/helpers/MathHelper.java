package common.helpers;

public class MathHelper {

    public MathHelper(){}

    public static int square(int n){
        return n*n;
    }
    public static int raiseTo(int base, int exp){
        int newNum=1;
        for(int i=0;i<exp;i++)
            newNum *= base;
        return newNum;
    }
    public static int Factorial(int n){
        int newNum=n;
        while(n>1){
            newNum *= (--n);
        }
        return newNum;
    }
    public static boolean isSquareRoot(int root, int square){
        if(square/root == root)
            return true;
        return false;
    }
}
