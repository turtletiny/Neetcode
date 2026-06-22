class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replace(" ", "");
        int l = 0;
        int r = s.length() - 1;
        System.out.println(s);
        while (l < r){
            if (s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.isPalindrome("Was it a car or a cat I saw?"));
    }
}
