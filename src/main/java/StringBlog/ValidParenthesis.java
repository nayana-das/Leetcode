package StringBlog;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s="([)]}";
        Stack parenthesis=new Stack();
        try{
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                    parenthesis.push(s.charAt(i));
                }
                else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
                    parenthesis.pop();
                }
            }

            if(parenthesis.isEmpty()){
                System.out.println("Valid parenthesis");
            }
            else{
                System.out.println("Not valid");
            }
        }
        catch(Exception e){
            System.out.println("Not valid parenthesis");
        }

    }
}
