import java.util.List;
class Solution {
    char[] code = new char[256];
    for(int i = 0; i < code.length; i++){
        char character = (char) (256 - code[i]);
        code[i] = character;
    }

    public String encode(List<String> strs) {
        String encodedString = "";
        for (String s : strs){


        }
        return encodedString;
    }

    public List<String> decode(String str) {

    }
}
