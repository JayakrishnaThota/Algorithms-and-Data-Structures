package SearchingAlgorithms;
import java.util.*;

public class FrequentElement {

    //O(n2) and O(1)
    public static int mostFrequent1(int[] A){
        int n = A.length;
        int freq = 0, max = 0, ret = 0;
        for(int i=0;i<n;i++){
            freq = 0;
            for(int j=0;j<n;j++){
                if(A[i]==A[j]) freq++;
            }
            if(freq>max){
                max = freq;
                ret = A[i];
            }
        }
        return ret;
    }

    //O(nlogn) and O(1)
    public static int mostFrequent2(int[] A){
        Arrays.sort(A);
        int n = A.length;
        int freq = 1, max = 0, ret = A[0];
        for(int i=1;i<n;i++){
            if(A[i]==A[i-1]){
                freq++;
            }
            else{
                if(freq>max){
                    max = freq;
                    ret = A[i-1];
                }
            }
        }
        if(freq>max) return A[n-1];
        return ret;
    }


    //O(n) and O(n)
    public static int mostFrequent3(int[] A){
        Map<Integer, Integer> map = new HashMap<>();
        for(int a:A) map.put(a, map.getOrDefault(a,0)+1);
        int max = 0, ret = 0;
        for(int key:map.keySet()){
            int value = map.get(key);
            if(value>max){
                max = value;
                ret  =key;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 1, 3, 4, 1, 3};
        System.out.println(mostFrequent1(arr));
        System.out.println(mostFrequent2(arr));
        System.out.println(mostFrequent3(arr));
    }
}
