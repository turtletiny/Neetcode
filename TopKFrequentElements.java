import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        int[] res = new int[k];
        for (int i : nums) {
            if (counter.containsKey(i)) {
                counter.put(i, counter.get(i) + 1);
            } else {
                counter.put(i, 1);
            }
        }
        List<Integer> values = new ArrayList<>(counter.values());
        Collections.sort(values, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            res[i] = values.get(i);
        }
        for (Integer key : counter.keySet()) {
            for (int i = 0; i < res.length; i++) {
                if (counter.get(key) == res[i]) {
                    res[i] = key;
                }
            }
        }
        return res;
    }
}

class TopKFrequentElements {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 70, 70, 70, 2, 69, 69 };
        for (int i : sol.topKFrequent(nums, 2)) {
            System.out.println(i);
        }
    }
}
