package ArraysTop30;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] a={0, 3, 1,1,1, 2, 3,0};
        HashMap<Integer,Integer> countMap=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(countMap.containsKey(a[i])){
                countMap.put(a[i],countMap.get(a[i])+1);
            }
            else{
                countMap.put(a[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry:countMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }

}
