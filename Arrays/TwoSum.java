/*
Problem: Two Sum (Check if pair exists)
Platform: GFG / Practice
Approach: Brute Force using two loops

Explanation:
We check every possible pair (i, j) such that
i < j and arr[i] + arr[j] == target.
If any such pair is found, return true.

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

class Solution {

    boolean twoSum(int arr[], int target) {
        int n = arr.length;

        // Check all possible pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // If pair sum equals target
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }

        // No pair found
        return false;
    }
}
