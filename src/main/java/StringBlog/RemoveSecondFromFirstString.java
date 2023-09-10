package StringBlog;

public class RemoveSecondFromFirstString {
    public static void main(String[] args) {
        String s1="hellodevil";
        String s2="hell";
        String s3="";

      // s3= s1.replaceAll(s2,"");

        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(s1.contains(ch+"")){
                //System.out.println(s1.indexOf(ch));
                s3=s1.replaceAll((ch+""),"");
            }
        }
        System.out.print(s3);
    }
}
