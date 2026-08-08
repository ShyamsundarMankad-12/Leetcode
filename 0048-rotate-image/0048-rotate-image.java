class Solution {
    public void rotate(int[][] matrix) {
        int i = 0;
        int j = matrix.length - 1;
        
        // reverse the rows
        while(i < j){
            for(int k = 0; k < matrix[0].length;k++){
                int temp = matrix[i][k];
                matrix[i][k] = matrix[j][k];
                matrix[j][k] = temp;
            }
            i++;
            j--;
        }

        // In place transpose 
        for(i = 0;i<matrix.length;i++){
            for(j = i+1;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}