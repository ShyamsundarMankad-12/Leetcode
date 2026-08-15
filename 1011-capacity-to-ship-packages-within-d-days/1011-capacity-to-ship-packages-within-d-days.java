// Same logic as koko eating bananas
// we can divide pakages into parts , so either weights[i] can go on the same day or in next day 
class Solution {
    public boolean canShip(int[] weights , int days , int c){
        int totalDays = 1;
        int sum = 0;
        for(int weight : weights){
            // jo vadhi jay to totalday++ , baki same day allowed chhe aetle bije kyak totalDays++ nai aave 
            if(sum + weight > c){
                totalDays++;
                sum=weight;
            }
            else{
                sum+=weight;
            }
            
        }
        return totalDays <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        int ans = 0;
        for(int weight : weights){
            low = Math.max(low , weight);
            high+=weight;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(canShip(weights , days , mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}