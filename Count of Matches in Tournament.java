class Solution {
    public int numberOfMatches(int n) {
        int mat=0;
        while(n!=1){
            if(n%2==0){
                mat+=n/2;
                n=n/2;
            }
            else{
                mat+=(n-1)/2+1;
                n=(n-1)/2;
            }
        }
        return mat;
        
    }
}
