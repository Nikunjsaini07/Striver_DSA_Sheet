class Solution {
    public int longestConsecutive(int[] nums) {
         HashSet<Integer> ans = new HashSet<>();
         for(int num : nums ){
            ans.add(num);
         }
         int max = 0;
         for (int num : nums) {
    if (!ans.contains(num)) continue;

    ans.remove(num);
    int count = 1;
    int left = num - 1;
    int right = num + 1;

    while (ans.contains(left)) {
        ans.remove(left);
        count++;
        left--;
    }

    while (ans.contains(right)) {
        ans.remove(right);
        count++;
        right++;
    }

    max = Math.max(max, count);
}


         return max;
    }
}