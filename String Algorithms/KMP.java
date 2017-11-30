public class kmp {
	static int[] table;
	public static void filltable(String s){
		table = new int[s.length()];
		int i=1, j=0;
		table[0] = 0;
		while(i<s.length()){
			if(s.charAt(i)== s.charAt(j)){
				table[i] = j+1;
			    i++;
				j++;
			}
			else if(j>0){
				j = table[j-1];
			}
			else{
				table[i] = 0;
				i++;
			}
		}
	}
	public static int kmp(String text, String pattern){
		filltable(pattern);
		int m = text.length();
		int n = pattern.length();
		int i =0, j =0;
		while(i<m){
			if(text.charAt(i)== pattern.charAt(j)){
				if(j==n-1){
					return i-j;
				}
			    i++;
				j++;
			}
			else if(j>0){
				j = table[j-1];
			}
			else{
				i++;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		String text = "bacbabababacaca";
		String pattern = "ababaca";
		System.out.println(kmp(text,pattern));
	}
}
