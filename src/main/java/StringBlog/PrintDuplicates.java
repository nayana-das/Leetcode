package StringBlog;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicates {
    public static void main(String[] args) {
        String s="abbhssgfddhahh";
        HashMap<Character,Integer> charCountMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(charCountMap.containsKey(s.charAt(i))){
                charCountMap.put(s.charAt(i),charCountMap.get(s.charAt(i))+1);
            }
            else{
                charCountMap.put(s.charAt(i),1);
            }
        }
            for (char ch : charCountMap.keySet()) {
                if (charCountMap.get(ch) > 1) {
                    System.out.print(ch);
                }
            }

    }
}
