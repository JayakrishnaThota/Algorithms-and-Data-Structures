public class Solution{
	public int Tiling(int n){
	//Base cases, F1 =1, F2 = 2
		if(n==1) return 1;
		if(n==2) return 2;
		int a = 1, b=2;
		int c = 0;
		for(int i=2;i<n;i++){
			c = a+b;
			a = b;
			b = c;
		}
		return c;
	}
}