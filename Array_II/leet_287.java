class Solution {
    public int findDuplicate(int[] nums) {
        
        HashSet<Integer> ans = new HashSet<>();

        int sum = 0;
        for(int n : nums){
            if(ans.contains(n)){
                return n;
            }
            ans.add(n);
        }
        return -1;

       
       
    }
}