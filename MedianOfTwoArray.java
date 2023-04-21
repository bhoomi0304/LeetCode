class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int [] newarr=new int[n]; 
        while(i<=n1 && j<=n2){
            if(i==n1){
                while(j<n2){
                    newarr[k++]=nums2[j++];

                }
                break;
            } if(j==n2){
                while(i<n1){
                    newarr[k++]=nums1[i++];

                }
                break;
            }
            if(nums1[i]<nums2[j]){
                newarr[k++]=nums1[i++];

            }
            else{
                newarr[k++]=nums2[j++];

            }
        }
        if(n%2==0){
            return (float)(newarr[n/2-1]+ newarr[n/2])/2;
        }
        else{
            return (float)(newarr[n/2]);
        }
    }
}
