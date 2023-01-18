class Solution {
    public int countPrimes(int n) {
        boolean[] isCompo = new boolean[n];
        int c = 0;
        for (int m = 2; m < n; m++) {
            if (!isCompo[m]) {
                c++;
                for (int x = 2; m * x < n; x++) {
                    isCompo[m* x] = true;
                }
            }
        }
        return c;
    }
}
