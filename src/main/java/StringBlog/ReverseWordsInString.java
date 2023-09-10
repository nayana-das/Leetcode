package StringBlog;

public class ReverseWordsInString {
    public static void main(String[] args) {

        String sentence= "devil was live";
        for(String word:sentence.split(" ")){
            System.out.print(" "+ reverseWord(word));
        }

    }

    public static String reverseWord(String word){
        String rev="";
        for(int i=0;i<word.length();i++){
            rev=word.charAt(i)+rev;
        }
        return rev;
    }
}
