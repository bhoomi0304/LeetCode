class Solution {
    public int kthFactor(int n, int k) {
        int count=0,i;
        for( i=1;i<=n && count<k ;i++){
            if(n%i ==0 ){
                count++;
            }
        }
        if(count==k){
            return i-1;
        }
        else{
            return -1;
        }
        
    }
}
