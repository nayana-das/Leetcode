package ArraysTop30;
//given an integer array which contains numbers from 1 to 100 but one number is missing,
// you need to write a Java program to find that missing number in an array
public class MissingNumber {
    public static void main(String[] args) {
        int[] a={1,2,3,5,6}; int n=6;
        int expected=n*(n+1)/2;
        int actual=0;

        for(int i=0;i<a.length;i++){
            actual=actual+a[i];
        }
        System.out.println(expected + " " +actual);

        System.out.println("Missing number = "+(expected-actual));
    }
}
