class Solution {
    public int largestAltitude(int[] gain) {
        int large=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum=sum+gain[i];
            if(sum>large){
                large=sum;
            }
        }
        return large;
        
    }
}
