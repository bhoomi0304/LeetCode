class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int res = 0;
        int[] remainders = new int[k];
        remainders[0] = 1;
        int prefixSum = 0;
        for (int num : nums) {
            prefixSum += num;
            int remainder = ((prefixSum % k) + k) % k;
            res += remainders[remainder]++;
        }
        return res;
    }
}
