package Assignment_17;

import java.util.*;

//Node structure
class TreeNode {
 int data;
 TreeNode left, right;

 TreeNode(int val) {
     data = val;
     left = right = null;
 }
}

public class LevelOrderTraversal {

 // Method to build tree from level order input
 public static TreeNode buildTreeLevelOrder() {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter root value (-1 for null): ");
     int rootVal = sc.nextInt();
     
     if (rootVal == -1) return null;

     TreeNode root = new TreeNode(rootVal);
     Queue<TreeNode> queue = new LinkedList<>();
     queue.offer(root);

     while (!queue.isEmpty()) {
         TreeNode current = queue.poll();

         System.out.println("Enter left child of " + current.data + " (-1 for null): ");
         int leftVal = sc.nextInt();
         if (leftVal != -1) {
             current.left = new TreeNode(leftVal);
             queue.offer(current.left);
         }

         System.out.println("Enter right child of " + current.data + " (-1 for null): ");
         int rightVal = sc.nextInt();
         if (rightVal != -1) {
             current.right = new TreeNode(rightVal);
             queue.offer(current.right);
         }
     }
     return root;
 }

 // Level order traversal
 public static void levelOrderTraversal(TreeNode root) {
     if (root == null) return;

     Queue<TreeNode> queue = new LinkedList<>();
     queue.offer(root);
     
     System.out.println("Level Order Traversal:");
     while (!queue.isEmpty()) {
         TreeNode current = queue.poll();
         System.out.print(current.data + " ");

         if (current.left != null)
             queue.offer(current.left);
         if (current.right != null)
             queue.offer(current.right);
     }
 }

 // Main function
 public static void main(String[] args) {
     TreeNode root = buildTreeLevelOrder();
     levelOrderTraversal(root);
 }
}
