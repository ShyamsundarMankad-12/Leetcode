// Logic :-   
        // first find the max of middle row , then compare that max with upper and lower element , move accordingly 
        // we are applying binary search on row so TC = O(n log(m))
        // so low and high will move with respect to row size 
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int low = 0;
        int high = m-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            
            int col = 0;

            // finding the max element int that row
            for(int j = 0;j<n;j++){
                if(mat[mid][j] > mat[mid][col]){
                    col = j;
                }
            }
            int upperElement = mid > 0 ? mat[mid-1][col] : -1;
            int downElement = mid < m-1 ? mat[mid+1][col] : -1;

            if(mat[mid][col] < upperElement){
                high = mid - 1;
            }
            else if(mat[mid][col]<downElement){
                low = mid+1;
            }
            else {
                return new int[] {mid,col};
            }
        }
        return new int[] {-1,-1};
    }
}