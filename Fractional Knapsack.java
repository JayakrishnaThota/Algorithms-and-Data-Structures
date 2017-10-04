
import java.util.*;
public class FracKnap {
public static double FracKnap(int[] w, int[] v, int C) throws IllegalArgumentException{
	double result = 0;
	if(w.length!=v.length)
		throw new IllegalArgumentException("The arguements are not correctly specified");
	int[] array = new int[w.length];
	for(int i=0;i<w.length;i++){
		array[i] = v[i]/w[i];
		array[i] = array[i]*(-1);
	}
	//Troubles of sorting an array in increasing order
	Arrays.sort(array);
	for(int i=0;i<w.length;i++){
		array[i] = array[i]*(-1);
	}
	int i = 0;
	//Check until the items are no more or the capacity is gone
	while(i<v.length && C>0){
		int fraction = Math.min(w[i],C);
		result+= array[i]*fraction;
		C-=fraction;
		i++;
	}
	return result;
}
public static void main(String[] args){
	int[] w = {10,20,30};
	int[] v = {60,100,120};
	int c = 50;
	System.out.println(FracKnap(w,v,c));
}
}
