public class Solution{

  static TreeNode root;

  public int ceil(TreeNode root, int key){
    //base case
    if(root == null){
      return -1;
    }
    //equal key found
    if(root.val == key){
      return root.val;
    }
    //root's val is smaller, ceil must be in the right subtree
    if(root.val < key){
      return ceil(root.right, key);
    }
    //either left subtree or the root has the ceil value
    int ceil = ceil(root.left, key);
    return (ceil >= key) ? ceil : root.val;
  }

  public int floor(TreeNode root, int key){
    if(root == null){
      return -1;
    }
    if(root.val == key){
      return root.val;
    }
    if(root.val > key){
      return floor(root.left, key);
    }
    int floor = floor(root.right, key);
    return (floor >= key) ? floor : root.val;
  }

  public static void main(String args[]){
      Solution tree = new Solution();
      tree.root = new TreeNode(10);
      tree.root.left = new TreeNode(5);
      tree.root.right = new TreeNode(20);
      tree.root.left.left = new TreeNode(1);
      tree.root.left.right = new TreeNode(8);

      System.out.println(tree.ceil(root, 9));
      System.out.println(tree.floor(root, 9));
  }
}
