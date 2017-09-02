public class Solution{
  static TreeNode root;
  public int findMax(int[] arr, int left, int right){
    int max = left;
    for(int i = left; i < right; i++){
      if(arr[i] > arr[max]){
        max = i;
      }
    }
    return max;
  }

  public TreeNode createTree(int[] arr, int left, int right){
    if(left == right){
      return null;
    }
    int max = findMax(arr, left, right);
    TreeNode root = new TreeNode(arr[max]);
    root.left = createTree(arr, left, max);
    root.right = createTree(arr, max +1, right);
    return root;
  }

  public static void main(String args[]){
    Solution tree = new Solution();
    int[] arr = new int[]{3, 2, 1, 6, 0, 5};
    //tree.root = tree.constructMaximumTree(arr);
    tree.printTree(tree.constructMaximumTree(arr));
  }

  public void printTree(TreeNode root){
    if(root != null){
      printTree(root.left);
      System.out.print(root.data + " ");
      printTree(root.right);
    }
  }

  public TreeNode constructMaximumTree(int[] arr){
    return createTree(arr, 0, arr.length);
  }
}
