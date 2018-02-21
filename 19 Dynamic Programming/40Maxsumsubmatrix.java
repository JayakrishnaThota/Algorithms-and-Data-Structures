//Tc:O(nm), SC: O(nm)
public class Solution {
	public static int maximalSquare(int[][] matrix)
	{
		if(matrix==null||matrix.length==0||matrix[0].length==0) return 0;
		int currentSum = 0, maxSum = 0;
		int row = matrix.length;
		int column = matrix[0].length;
		int[] array = new int[row];
		for(int L=0;L<column;L++){
			for(int i=0;i<row;i++)
			array[i] = 0;
			for(int R=L;R<column;R++){
				for(int i=0;i<row;i++)
				array[i] += matrix[i][R];
				currentSum = kadane(array);
				maxSum = Math.max(currentSum, maxSum);
			}
		}
		return maxSum;
	}
	public static int kadane(int[] nums) {
        int maxsofar = nums[0], maxendinghere = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            maxsofar = Math.max(maxsofar+nums[i], nums[i]);
            maxendinghere = Math.max(maxendinghere, maxsofar);
        }
        return maxendinghere;
    }
	public static void main(String[] args){
		int input[][] = {{ 2,  1, -3, -4,  5},
                { 0,  6,  3,  4,  1},
                { 2, -2, -1,  4, -5},
                {-3,  3,  1,  0,  3}};
		System.out.println(maximalSquare(input));
	}
}
