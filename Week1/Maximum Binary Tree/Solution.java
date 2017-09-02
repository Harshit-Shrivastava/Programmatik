public class Solution{
  public int max(int[] arr){
    int n = arr.length;
    int max = 0;
    for(int i = 1; i < n; i++){
      if(arr[i] > arr[max]){
        max = i;
      }
    }
    return max;
  }
}
