public class Solution{
  //O(n2) and O(1)
  public boolean isDuplicates(int[] arr){
    if(arr==null || arr.length==0) return false;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]) return true;
      }
     }
     return false;
  }
  
  //O(nlogn) and O(1)
  public boolean isDuplicates(int[] arr){
    if(arr==null || arr.length==0) return false;
    Arrays.sort(arr);
    int n = arr.length;
    for(int i=1;i<arr.length;i++){
      if(arr[i]==arr[i-1]) return true;
    }
     return false;
  }

  //O(n) and O(n)
  public boolean isDuplicates(int[] arr){
    if(arr==null || arr.length==0) return false;
    Set<Integer> set = new HashSet();
    for(int a:arr)
      if(!set.add(a)) return true;
    return false;
  }
}
