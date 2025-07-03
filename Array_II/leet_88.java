class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int pt2 = n-1 ;
        int pt1 = m - 1  ;
        int end = nums1.length-1 ;
        while(pt2>=0){
            if(pt1 >= 0 && nums2[pt2] < nums1[pt1]){
                nums1[end--]=nums1[pt1--];
            }
            else{
                nums1[end--]=nums2[pt2--];
            }
        }


    }
}