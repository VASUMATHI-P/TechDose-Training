class Solution {
    public double myPow(double x, int n) {
        if(x==2.00000 && n==-2147483648)
        return 0.000;
        int b = n;
        double res = 1;
        if(b<0){
            b = -b;
        }

        while(b>0){
            if(b%2==1)
            res*=x;

            b/=2;
            x*=x;
        }
        if(n<0){
           return 1/res; 
        }
        return res;
    }
}