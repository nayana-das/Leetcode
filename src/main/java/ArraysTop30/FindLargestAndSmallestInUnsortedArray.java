package ArraysTop30;

public class FindLargestAndSmallestInUnsortedArray {
    public static void main(String[] args) {
        int[] a={2,3,5,1,7,9,8};
        int smallest=a[1],largest=a[1];

        for(int i=0;i<a.length;i++){
            if(a[i]<smallest){
                smallest=a[i];
            }
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println("Smallest is "+smallest+" and largest is "+largest);
    }
}
