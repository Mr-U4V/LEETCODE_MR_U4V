class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int [] x=  new  int [m+n];
        int a=0 ;
        int b=0;
        int k=0;
        while(a<m || b<n ){
            if(a<m){
                x[k++]=nums1[a];
                a++;
            }
            if(b<n){
                x[k++] = nums2[b];
                b++;
            }
        }
        Arrays.sort(x);
        int len = (x.length);
        double median =0;
        if  (len%2==0){
            median =  (x[len/2] + x[(len/2)-1])/2.0;
        }
        else{
            median = x[(len/2)];
        }
        return median;
    }
}