package RecursionandBackTracking;
import java.util.*;

public class GenerateKary {
    public static void helper(List<String> list, StringBuilder s, char[] ch, int n, int k){
        if(s.length()==k){
            list.add(new String(s));
            return;
        }
        for(int i=0;i<n;i++){
            s.append(ch[i]);
            helper(list, s, ch, n, k);
            s.deleteCharAt(s.length()-1);
        }
    }

    public static void display(List<String> list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        char[] ch = {'a','b'};
        int n = ch.length;
        int k = 3;
        List<String> list = new ArrayList();
        helper(list, new StringBuilder(), ch, n, k);
        display(list);
    }
}
