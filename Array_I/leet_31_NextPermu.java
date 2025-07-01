class Solution {
    public void nextPermutation(int[] nums) {
         if(nums.length==1){
            return;
        }
       int pivot = 0 ;
        int i;
        for(i = nums.length - 1  ;  i > 0 ; i--){
            if(nums[i] > nums[i-1]){
                pivot = i-1 ;
                break ;
            }
        }
        for( int j = nums.length - 1  ;  j >= 0 ; j--){
            if(nums[pivot]  < nums[j]){
               int temp =  nums[pivot] ;
               nums[pivot] = nums[j];
               nums[j] = temp ;
               break;
            }
        }
        for(int j  =  0; j <= (nums.length -1 - i )/ 2 ; j++){
             int temp =  nums[i+j] ;
               nums[i+ j] = nums[nums.length - 1 - j];
               nums[nums.length - 1 - j] = temp ;
        }


    }
    
}
