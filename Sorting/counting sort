//TC:O(n) SC:O(k)
// K is the upper bound + 1
public void count(int[] A, int k)
{
  int n = A.length;
  int[] B = Arrays.copyOf(A, A.length);
  int[] buckets = new int[k];
  //Count the number of elements
  for(int j=0;j<n;i++){
    buckets[A[j]]++;
  }
  for(int i=1;i<k;i++){
    buckets[i] += buckets[i-1];  
  }
  for(int j=n-1;j>=0;j--){
      B[buckets[A[j]]] = A[j];
      buckets[A[j]]--;
  }
}
