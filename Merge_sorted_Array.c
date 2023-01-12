class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int TEMP[]=new int[m+n];
       for(int x=0;x<m;x++){
          TEMP[x]=nums1[x];
       }
       for(int y=0;y<n;y++){
           TEMP[y+m]=nums2[y];
       }
       for(int z=0;z<TEMP.length;z++){
           nums1[z]=TEMP[z];
       }
       Arrays.sort(nums1);
    }
}
