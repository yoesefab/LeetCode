class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0 ; 
        int sol = 0 ;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == 1) { sol++; }
            else {
                if (sol > max) { max = sol; }
                sol = 0 ; 
            }
        }
        if (sol > max) { max = sol; }
        return max ;
    }
}