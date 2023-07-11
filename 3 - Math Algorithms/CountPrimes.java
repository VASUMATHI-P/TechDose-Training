class Solution {
    public int countPrimes(int n) {
       
        int count=0;
        if(n<=2)
        return 0;
        int[] arr = new int[n];
        for(int i=2;i<=Math.sqrt(n);i++){
            if(arr[i]==0){
                for(int j=2;i*j<n;j++)
                arr[i*j]=1;
            }
        }
        for(int i=2;i<n;i++){
            if(arr[i]==0)
            count++;
        }

        return count;
    }
}