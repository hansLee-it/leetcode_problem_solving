class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        
        int loc = m+n-1;
        int i = m-1;
        int j = n-1;
        int inst = 0;
        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[loc--] = nums1[i--];
            }else{
                nums1[loc--] = nums2[j--];
            }
        }
        return nums1;
    }
}