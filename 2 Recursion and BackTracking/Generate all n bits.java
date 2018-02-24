package RecursionandBackTracking;
import java.util.*;
public class Generatenbits {
    public static void generate(List<String> list, StringBuilder s, int n){
        if(n<1){
            list.add(new String(s));
            return;
        }
        s.append(0);
        generate(list,s,n-1);
        s.deleteCharAt(s.length()-1);
        s.append(1);
        generate(list,s,n-1);
        s.deleteCharAt(s.length()-1);
    }

    public static void display(List<String> list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args){
        int n = 9;
        List<String> list = new ArrayList();
        generate(list,new StringBuilder(),n);
        display(list);
    }
}
