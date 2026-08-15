// Logic :-    if koko can eat banans in k (i.e. k banans per hour) then she can definitly eat bananas in >k   
        // so min speed will be 1 , max will be max of piles 
        // so for each mid we will see that k speed is valid or not 
            // if valid then go to the left to fing smaller speed
            // if not valid then go to the right to find the speed
        // after finding one valid speed (k) we will still go to the left to find smaller one 

class Solution {

    public boolean canEat(int[] piles , int h ,int k){
        long totalHoursWithKSpeed = 0;
        for(int pile : piles){
            // if pile = 7 and k = 3 then we it means koko need 7/3 = ceil(7/3) = 3 hours not 2 
            totalHoursWithKSpeed+= (pile + (long)k - 1) / k;
        }
        return totalHoursWithKSpeed <= h ;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        int ans = 0;
        for(int pile : piles){
            high = Math.max(high , pile);
        }
        while(low <= high){
            int mid = low + (high-low)/2;
            if(canEat(piles , h , mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}