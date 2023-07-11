class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int count = 0;
        if(m==0)
        return 0;
        while(m!=n){
            m>>=1;
            n>>=1;
            count++;
        }
        return n<<count;
        
    }
}