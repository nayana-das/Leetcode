package StringBlog;

import java.util.HashMap;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        String s="dddcbbbaeeeef";
        HashMap<Character,Integer> charCount=new HashMap<>();
        int maxCharCount=0;
        char maxChar = 0;
        
        for(int i=0;i<s.length();i++){
            if(charCount.containsKey(s.charAt(i))){
                charCount.put(s.charAt(i),charCount.get(s.charAt(i))+1);
                if((charCount.get(s.charAt(i))+1)>maxCharCount){
                    maxCharCount=charCount.get(s.charAt(i));
                    maxChar=s.charAt(i);
                }
            }
            else{
                charCount.put(s.charAt(i),1);
            }
        }

        System.out.println("max occurring char is : "+maxChar + " occurrence : "+maxCharCount);
        
    }
}
