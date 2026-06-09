import java.util.Arrays;
class Solution {
    public void productExceptSelf(int[] nums) {
        int[] suffix = new int[nums.length];
        int[] prefix = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i ++){
            product *= nums[i];
            prefix[i] = product;
        }
        product = 1;
        for (int i = nums.length-1; i >= 0; i--){
            product *= nums[i];
            suffix[nums.length - i - 1] = product;
        }
        System.out.println("prefix: " + Arrays.toString(prefix));
        System.out.println("suffix: " + Arrays.toString(suffix));

    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] input = {1,2,4,6};
        sol.productExceptSelf(input);
    }
}
