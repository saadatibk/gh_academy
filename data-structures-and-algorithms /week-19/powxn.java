class Solution {
    public double myPow(double x, int n) {
        long exp = (long) n;

        if( exp < 0){
            exp = -exp;
            x = 1/x;
        }
        return My_Pow(x,exp);
    }

    private double My_Pow(double x, long exp){
        if(exp == 0) return 1;
        if ( exp % 2 == 0){
            return My_Pow( x * x, exp /2);
        } else {
            return My_Pow( x * x, exp /2) * x;
        }
    }
}
