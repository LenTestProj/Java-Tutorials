class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data = data;
        this.left=null;
        this.right=null;
    }
}


public class BinaryTree {

    TreeNode root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public TreeNode insertRec(TreeNode root, int data){
        if(root == null){
            root = new TreeNode(data);
        }
        else if(data < root.data){
            root.left = insertRec(root.left, data);
        }
        else if(data > root.data){
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void inorder(){
        inorderRec(root);
    }

    public void inorderRec(TreeNode root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

}
