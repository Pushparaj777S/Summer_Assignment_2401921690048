class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int j = 0;
        int max = 0;
        int[] freq = new int[128];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
            count++;
            while (freq[s.charAt(i)] > 1) {
                freq[s.charAt(j)]--;
                count--;
                j++;
            }

            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}