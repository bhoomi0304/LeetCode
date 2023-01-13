class Solution {
    public int removeElement(int[] nums, int val) {
        int x = 0;
        for(int m=0;m<nums.length;m++){
            if(nums[m]!=val){
                nums[x++]=nums[m];
            }
        }
        return x;
    }
}
