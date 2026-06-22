import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int k = nums.length;

        while (l < r) {
            if (nums[l] == nums[l + 1]) {
                int tmp = l;
                nums[l] = nums[r];
                nums[r] = nums[tmp];
                r--;
                l--;
                k--;
            }
            l++;
        }
        System.out.println(Arrays.asList(nums));
        return k;
    }
}
