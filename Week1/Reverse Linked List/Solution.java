public class Solution{

    static Node root;

    public static void main(String args[]){
        Solution list = new Solution();
        list.root = new Node(1);
        root.link = new Node(2);
        root.link.link = new Node(3);
        root.link.link.link = new Node(4);
        list.display(root);
        list.display(list.reverse(root));
    }

    public Node reverse(Node root){
        Node prev, cur, next;
        if(root == null){
            return null;
        }
        if(root.link == null){
            return root;
        }
        prev = null;
        cur = root;
        next = null;
        while(cur != null){
            next = cur.link;
            cur.link = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public void display(Node root){
        if(root == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println();
        while(root != null){
            System.out.print(root.data + " ");
            root = root.link;
        }
    }
}
