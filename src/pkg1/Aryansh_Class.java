package pkg1;
public class Aryansh_Class {
    public TreeNode root;
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val){
            this.val = val;
        }
    }
    
    public void createBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(4);
        TreeNode fourth = new TreeNode(8);
        TreeNode fifth = new TreeNode(1);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);
        
        root = first;
        first.left = second;
        first.right = third;
        
        second.left = fourth;
        second.right = fifth;
        
        third.left = sixth;
        third.right = seventh;
        
    }
    
    public void preorder(TreeNode root){
        if(root == null)
            return;
        
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    
	
}