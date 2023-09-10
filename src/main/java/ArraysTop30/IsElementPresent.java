package ArraysTop30;

import java.util.Arrays;

public class IsElementPresent {
    public static void main(String[] args) {
        int n=7;
        int [] a={1,4,3,2,8,5};
        Arrays.sort(a);
        int l=0,r=a.length-1;

        while(l<=r){
            int m=l+(r-1)/2;
            if(a[m]==n){
                System.out.println("Present");
                break;
            }
            else if(a[m]<n){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        System.out.println("Not present");
    }
}
