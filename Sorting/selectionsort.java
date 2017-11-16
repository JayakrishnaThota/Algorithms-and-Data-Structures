package sorting;

import java.util.Scanner;

public class selectionsort {

	public static void selectionsort(int[] A){
		for(int j=0;j<A.length;j++)
		{
			int min = A[j];
			for(int i=1;i<A.length;i++){
				if(A[i]<min)
					min = A[i];
			}
			A[j] = min;
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
		selectionsort s = new selectionsort();
		s.selectionsort(array);
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
}
