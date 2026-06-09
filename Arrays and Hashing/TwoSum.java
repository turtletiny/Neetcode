import java.util.ArrayList;
import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (indexMap.containsKey(target - nums[i])) {
                return new int[] { indexMap.get(target - nums[i]), i };
            }
            indexMap.put(nums[i], i);
        }

        return new int[] {};
    }
}

public class TwoSum {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 3, 2, 5, 6 };
        for (int i : sol.twoSum(nums, 7)) {
            System.out.println(i);
        }
    }
}
