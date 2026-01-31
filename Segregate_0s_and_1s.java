// GFG Problem: Segregate 0s and 1s
// Approach: Count number of zeros and overwrite array
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    void segregate0and1(int[] arr) {

        int zeros = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zeros++;
        }

        for (int i = 0; i < zeros; i++) {
            arr[i] = 0;
        }

        for (int i = zeros; i < arr.length; i++) {
            arr[i] = 1;
        }
    }
}
