package StringBlog;

public class CheckRotation {
    public static void main(String[] args) {
        String s1="xyz";
        String s2="yza";

        if(s1.length()==s2.length()){
            if((s1+s2).contains(s2)){
                System.out.println(s1+" is rotation of "+s2);
            }
            else{
                System.out.println(s1+" is not a rotation of "+s2);
            }
        }
        else{
            System.out.println(s1+" is not a rotation of "+s2);
        }

    }
}
