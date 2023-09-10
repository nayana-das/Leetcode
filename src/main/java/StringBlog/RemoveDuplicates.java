package StringBlog;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s="aabbsghffff";
        HashSet<Character> uniqueCharSet = new LinkedHashSet<>();

        for(int i=0;i<s.length();i++){
            uniqueCharSet.add(s.charAt(i));
        }
        Iterator<Character> itr=uniqueCharSet.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}
