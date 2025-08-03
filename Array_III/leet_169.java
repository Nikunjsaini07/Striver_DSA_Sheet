class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0;
        HashMap<Integer , Integer> temp = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            temp.put(nums[i] , temp.getOrDefault(nums[i] , 0 ) + 1 );
            
        }
        for(int i : temp.keySet()){
                if(temp.get(i) > nums.length/2 ){
                     ans = i;
                     break;
                }
            }
            return ans;
        
    }
}