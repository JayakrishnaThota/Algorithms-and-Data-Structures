//TC:O(n2)
//SC:O(1)
package sorting;
import java.util.Scanner;

public class insertionsort {

	public void insertionsort(int[] A){
		int i=0,j=0;
		for(i=1;i<A.length;i++){
			int key = A[i];
			j = i;
			while(j>0&&A[j-1]>key){
				A[j] = A[j-1];
				j--;
			}
			A[j] = key;
		}
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Kindly enter the length of the array you want to sort");
		int length = in.nextInt();
		int[] array = new int[length];
		System.out.println("Kindly enter the contents of the array");
		for(int i=0;i<length;i++){
			array[i] = in.nextInt();
		}
		insertionsort i = new insertionsort();
		i.insertionsort(array);
		for(int j=0;j<array.length;j++)
			System.out.println(array[j]);
	}
}
