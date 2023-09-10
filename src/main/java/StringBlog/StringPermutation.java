package StringBlog;

public class StringPermutation {

    public static void main(String[] args) {

        String s="xy";
        permute(s,0,s.length());

    }

    public static void permute(String s, int l,int r){
        if(l==r){
            System.out.println(s);
        }

        else{
            for(int i=l;i<r;i++){
                s=swap(s,l,i);
               // System.out.println(s);
                permute(s,l+1,r);
                s=swap(s,l,i);
                //System.out.println(s);
            }
        }
    }

    public static String swap(String s, int first, int last){
        char[] temp=s.toCharArray();
        char ch;
        ch=temp[first];
        temp[first]=temp[last];
        temp[last]=ch;
        return String.valueOf(temp);
    }
}
