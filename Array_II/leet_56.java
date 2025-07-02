class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<List<Integer>> ans = new ArrayList<>();
        int  first = intervals[0][0] ;
        int second = intervals[0][1];
        for(int i = 1 ; i  < intervals.length ; i++){
              if(second >= intervals[i][0] ){
                   second = Math.max(second , intervals[i][1]);
              }
              else{
                  ans.add(Arrays.asList(first , second));
                  first = intervals[i][0];
                  second = intervals[i][1];

              }
        }
        ans.add(Arrays.asList(first , second));
        int[][] result = new int[ans.size()][2];
        for(int i = 0 ; i < ans.size() ; i++){
            result[i][0] = ans.get(i).get(0);

            result[i][1] = ans.get(i).get(1);

        } 
        return result;
    }
}