
import java.util.*;
public class PermutationsOfAStrig {
public static void permute(String s, int l, int r){
	if(l==r) System.out.println(s);
	else{
		 for (int i = l; i <= r; i++)
         {
             s = swap(s,l,i);
             permute(s, l+1, r);
             s = swap(s,l,i);
         }
	}
}
public static String swap(String a, int i, int j)
{
    char temp;
    char[] charArray = a.toCharArray();
    temp = charArray[i] ;
    charArray[i] = charArray[j];
    charArray[j] = temp;
    return String.valueOf(charArray);
}

public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	String s = in.nextLine();
	permute(s,0,s.length()-1);
}
}
