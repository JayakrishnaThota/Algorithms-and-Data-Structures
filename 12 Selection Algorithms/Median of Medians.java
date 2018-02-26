package SelectionAlgorithms;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class MedianOfMedians {
    public static void main(String[] args) throws java.lang.Exception {
        int[] arr = new int[] { 7, 15, 4, 3, 20, 10 };
        System.out.println("kth smallest in the given array is "
                + getKthSmallestQuickSelectWorstCaseLinearTime(arr, 0, arr.length - 1, 4));
    }

    private static int getKthSmallestQuickSelectWorstCaseLinearTime(int arr[], int low, int high, int k) {

        if (k > 0 && k <= high - low + 1) {
            // number of elements in array
            int n = high - low + 1;

            int i, median[] = new int[(n + 4) / 5];

            for (i = 0; i < median.length - 1; i++) {
                median[i] = getMedian(Arrays.copyOfRange(arr, 5 * i + low, 5 * i + low + 4), 5);
            }

            if (n % 5 == 0) {
                median[i] = getMedian(Arrays.copyOfRange(arr, 5 * i + low, 5 * i + low + 4), 5);
                i++;
            } else {
                median[i] = getMedian(Arrays.copyOfRange(arr, 5 * i + low, 5 * i + low + (n % 5)), n % 5);
                i++;
            }

            int medOfMed = i == 1 ? median[i - 1]
                    : getKthSmallestQuickSelectWorstCaseLinearTime(median, 0, i - 1, i / 2);

            int partition = partitionPractise(arr, low, high, medOfMed);

            if (partition - low == k - 1) {
                return arr[partition];
            }

            if (partition - low > k - 1) {
                return getKthSmallestQuickSelectWorstCaseLinearTime(arr, low, partition - 1, k);
            }

            return getKthSmallestQuickSelectWorstCaseLinearTime(arr, partition + 1, high, k - (partition + 1) + low);
        }

        return -1;
    }

    private static int getMedian(int arr[], int n) {
        Arrays.sort(arr);
        return arr[n / 2];
    }




    private static void swap(int[] arr, int i, int index) {
        if (arr[i] == arr[index]) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }

    private static int partitionPractise(int[] arr, int low, int high, int pivot) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == pivot) {
                swap(arr, i, high);
                break;
            }
        }
        int index = low - 1;
        int i = low;
        while (i < high) {
            if (arr[i] < pivot) {
                index++;
                swap(arr, i, index);
            }
            i++;
        }
        index++;
        swap(arr, index, high);
        return index;
    }

}
