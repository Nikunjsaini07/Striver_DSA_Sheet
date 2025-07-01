class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>  ans = new ArrayList<>();

        ans.add(new ArrayList<>(List.of(1)));
        for(int i = 2 ; i <= numRows ; i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            if(i > 2 ){
                for(int j = 1 ; j < ans.get(i-2).size() ; j ++ ){
                    temp.add(ans.get(i-2).get(j) + ans.get(i-2).get(j-1 ));
                }
            }
            temp.add(1);

            ans.add(temp);
        }
        return ans ;
    }
}
