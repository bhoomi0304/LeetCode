class Solution {
    public int findPeakElement(int[] nums) {
        int index=0,max=nums[0],i;
        for(i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        
       return index; 
    }
    
}
