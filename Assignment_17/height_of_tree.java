package Assignment_17;
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int data){
		this.data = data;
		left = right = null;
	}
}

public class height_of_tree {
	static int HeightOfTree(TreeNode root) {
		if(root == null)
			return -1;
		int left = HeightOfTree(root.left);
		int right = HeightOfTree(root.right);
		return Math.max(left, right)+1;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out.print(HeightOfTree(root));
	}
	
	
}
