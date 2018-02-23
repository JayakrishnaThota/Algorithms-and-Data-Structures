package DivideandConquer;

public class ShuffleArray {

    //O(nlogn) time and O(n) space
    public static void shufleArray(int a[], int f, int l)
    {
        // If only 2 element, return
        if (l - f == 1)
            return;

        // finding mid to divide the array
        int mid = (f + l) / 2;

        // using temp for swapping first half of second array
        int temp = mid + 1;

        // mmid is use for swapping second half for first array
        int mmid = (f + mid) / 2;

        // Swapping the element
        for (int i = mmid + 1; i <= mid; i++)
        {
            // swap a[i], a[temp++]
            int temp1 = a[i];
            a[i] = a[temp];
            a[temp++] = temp1;
        }

        // Recursively doing for first half and second half
        shufleArray(a, f, mid);
        shufleArray(a, mid + 1, l);
    }

    public static void display(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        display(array);
        shufleArray(array,0,array.length-1);
        display(array);
    }
}
