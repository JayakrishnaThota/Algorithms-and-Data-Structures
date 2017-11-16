package sorting;

import java.util.Scanner;

public class bubblesort {

	public void bubblesort(int[] A){
		for(int pass=A.length-1;pass>=0;pass--){
			for(int i=0;i<=pass;i++){
				if(A[i]>A[pass])
					swap(A,i,pass);
			}
		}
	}

	public static void swap(int[] A, int a, int b){
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
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
		bubblesort b = new bubblesort();
		b.bubblesort(array);
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
}
