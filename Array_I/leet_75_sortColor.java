public class leet_75_sortColor {
    public void sortColors(int[] nums) {
        int zero = 0;
        int two = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]==0){
                zero++;
            }
            if(nums[i]==2){
                two++;
            }
        }
   
        
         
        for(int i = zero  ; i <= nums.length - 1 - two ; i++){
            nums[i] = 1 ;
        }
        int i = 0 ;
        while(zero-- > 0){
            nums[i++] = 0;
        }
        i = nums.length - 1;
        while(two-->0){
            nums[i--] = 2 ;
        }

        
    }
}
