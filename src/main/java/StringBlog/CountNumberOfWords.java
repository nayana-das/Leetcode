package StringBlog;

public class CountNumberOfWords {
    public static void main(String[] args) {
        String sentence="Life    is to  test    ";
        String[] words=sentence.split("\\s+",0);
        System.out.println("Words count : "+words.length);
    }
}
