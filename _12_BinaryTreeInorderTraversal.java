package TopInterviewQuestions;

import java.util.ArrayList;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {}

    TreeNode(int value){
        this.val = value;
    }
    TreeNode(int value, TreeNode leftChild, TreeNode rightChild){
        this.val = value;
        this.left = leftChild;
        this.right = rightChild;
    }
}
public class _12_BinaryTreeInorderTraversal {
    public static void main(String[] args) {

    }
    ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return res;
    }

    public void traverse(TreeNode root){
        if(root == null){
            return;
        }
        traverse(root.left);
        res.add(root.val);
        traverse(root.right);
    }
}
