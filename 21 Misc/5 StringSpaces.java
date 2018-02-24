package Misc;
import java.util.*;
public class StringSpaces {

    public static String helper(String s){
        if(s==null || s.length()==0) return s;
        int i = s.length()-1;
        char[] ch = s.toCharArray();
        for(int j=i;j>=0;j--){
            char c = s.charAt(j);
            if(c!=' '){
                swap(ch, i--,j);
            }
        }
        return String.valueOf(ch);
    }

    public static void swap(char[] ch, int i, int j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public static void main(String[] args) {
        String s = "move these spaces to the beginning";
        System.out.println(helper(s));
    }
}
