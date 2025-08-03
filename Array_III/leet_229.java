class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length/3 ;
        Map<Integer, Integer> temp = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            temp.put(nums[i] , temp.getOrDefault(nums[i] , 0) + 1 );
            
        }
        for(int i : temp.keySet()){
            if(temp.get(i) > n){
                ans.add(i);
            }
        }
        return ans ;
    }
}
