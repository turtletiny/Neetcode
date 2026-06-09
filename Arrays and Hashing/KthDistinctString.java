import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.ArrayList;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> unique = new HashSet<>();
        Set<String> duplicate = new HashSet<>();
        for (String s : arr) {
            if (unique.contains(s)) {
                unique.remove(s);
                duplicate.add(s);
            } else {
                unique.add(s);
            }
        }
        for (String s : arr) {
            if (unique.contains(s)){
                k--;
            }
            if (k == 0){
                return s;
            }
        }
        return "";
    }
}
