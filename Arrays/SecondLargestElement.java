/*
Problem: Second Largest Element in Array
Platform: GFG / LeetCode
Approach: Single pass
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public static int getSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }

        return smax;
    }
}
