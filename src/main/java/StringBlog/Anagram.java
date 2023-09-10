package StringBlog;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="hitlerwoman";
        String s2="motherinlaw";

        char[] s1Arr=s1.toCharArray();
        char[] s2Arr = s2.toCharArray();

        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);

        if(Arrays.equals(s1Arr,s2Arr)){
            System.out.println(s1+" is anagram of "+s2);
        }
        else{
            System.out.println("Not anagram");
        }
    }
}
