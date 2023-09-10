package StringBlog;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        String s="appeal";
        char ch='e';
        String modified="";

        //using string methods
        for(int i=0;i<s.length();i++){
            if(s.contains(ch+"")){
               modified= s.replaceAll(ch+"","");
            }
        }
        System.out.println(modified);
    }


}
