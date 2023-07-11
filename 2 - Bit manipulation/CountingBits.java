class Solution {
    public int[] countBits(int n) {
        int count[] = new int[n+1];
        for(int i=1;i<=n;i++){
            if(i%2!=0)
            count[i]=count[i-1]+1;
            else
            count[i]=count[i>>1];
        }
        return count;
    }
}