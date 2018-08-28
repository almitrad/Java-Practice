class Solution {
    public int climbStairs(int n) {
        
        /*Pattern: (1 + (n-1) + (n-3) + (n-5) + ... + (n - (n-2)))*/
        
        if (n == 1){
            return 1;
        }
        else if (n == 2){
            return 2;
        }
        else if (n == 3){
            return 3;
        }
        else{
            return (n-2) + climbStairs(n-2);
        }
        
    }
    
}
