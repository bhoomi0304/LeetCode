// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x[]=new int[3];
        int k=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    x[k]=i;
                    k++;
                    x[k]=j;
                    break;
                }
            }
        }
        return x;

    }
}
