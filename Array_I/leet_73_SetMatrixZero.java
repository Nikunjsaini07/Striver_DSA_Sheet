class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length]; 
        boolean[] col = new boolean[matrix[0].length];

    
       
        for(int i = 0 ; i < matrix.length ; i++){
           for(int j = 0; j < matrix[i].length ; j++){
            if(matrix[i][j] == 0){
                row[i] = true ;
                col[j] = true ;
                
            }
           }
        }
        for(int i = 0 ; i < row.length ; i++){
            if(row[i] == true ){
                for(int j = 0 ; j < matrix[i].length ; j++){
                    matrix[i][j] = 0;
                }
            }
        }
         for(int i = 0 ; i < col.length ; i++){
            if(col[i] == true ){
                for(int j = 0 ; j < row.length ; j++){
                    matrix[j][i] = 0;
                }
            }
        }

    }
}