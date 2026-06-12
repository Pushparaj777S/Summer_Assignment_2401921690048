class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;
        for( int i = 0; i < k; i++){
            maxSum += nums[i];
        }
        int start = 0;
        int sum = maxSum;

        for ( int end = k; end < nums.length; end++){
            sum = sum - nums[start] + nums[end];
            if (sum > maxSum){
                maxSum = sum;
            }
           
            start++;
        }
        return (double) maxSum / k;

    
    }
}