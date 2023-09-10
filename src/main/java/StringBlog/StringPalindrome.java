package StringBlog;

public class StringPalindrome {
    public static void main(String[] args) {
        String s="madam";
        boolean flag=false;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)==s.charAt(s.length()-1-i)){
                flag=true;
            }
            else{
                flag=false;
            }
        }
        if(flag){
            System.out.println("Palindrome");
        }

        else {
            System.out.println("Not Palindrome");
        }
    }
}
