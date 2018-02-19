package Greedy;
import java.util.*;
//Given an array of weights, values and the capacity of the knapsack
//Imagine you are the thief with this knapsack and you can fill your knapsack
//with any item until it's capacity, find the max amount you can rob
public class FractionalKnapsack {
    //O(nlogn) time and O(n) space
    public int FractionalKnapsack(int[] v, int[] w, int c){
        int[] f = new int[v.length];
        for(int i=0;i<v.length;i++){
            int temp = v[i]/w[i];
            f[i] = temp;
        }
        Arrays.sort(f);
        int ret = 0;
        int i = v.length-1;
        while((i>=0) && (c>=0)){
            int curweight = w[i];
            //Take the entire item
            if(c-curweight>=0){
                ret+=v[i];
                c-=curweight;
            }
            else {
                int val = (v[i] / w[i]) * c;
                ret+=val;
                return ret;
            }
            i--;
        }
        return ret;
    }
    public static void main(String[] args) {
        FractionalKnapsack f = new FractionalKnapsack();
        int[] values = {60,100,120};
        int[] weights = {10,20,30};
        int capacity = 50;
        System.out.println("The max amount is "+f.FractionalKnapsack(values,weights,capacity));
    }
}
