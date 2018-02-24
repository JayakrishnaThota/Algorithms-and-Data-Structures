package RecursionandBackTracking;

public class TowersOfHanoi {
    //O(2pown) time and space
    public static void towers(int n, char frompeg, char topeg, char auxpeg){
        //Base case
        if(n==1){
            System.out.println("Move disk 1 from "+frompeg+" to "+topeg);
            return;
        }
        towers(n-1, frompeg,auxpeg,topeg);
        System.out.println("Move disk "+n+" from "+frompeg+" to "+topeg);
        towers(n-1,auxpeg,topeg,frompeg);
    }
    public static void main(String[] args) {
        towers(4, 'A', 'B', 'C');
    }
}
