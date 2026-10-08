//Clarifying questions
//The input nums can contain both +ve & -ve integers
//The input array can be empty?

//Approach
//I will iterate through the array and calculate the complement required to reach
//the target. I will use a HashMap to store previously visited numbers and their
//indices. If the complement exists in the map, I will return the two indices.
//Otherwise, I will insert the current number and continue.

//Time Complexity: O(N)
//Space Complexity: O(N)

//https://leetcode.com/problems/two-sum/submissions/2166016945/?envType=company&envId=apple&favoriteSlug=apple-all

import java.util.HashMap;
import java.util.Map;

class Solution {
    public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            if (nums == null || nums.length < 2) {
                return new int[0];
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[]{map.get(complement), i};
                }
                map.put(nums[i], i);
            }
            return new int[0];
        }
    }
}