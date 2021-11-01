package tree;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {
	 static List<Integer> li = new ArrayList<Integer>();
	public static void main(String[] args) {
		PostorderTraversal ld = new PostorderTraversal();
		TreeNode root;
		root = new TreeNode(1);
		//root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		//root.left.right = new TreeNode(5);
		List<Integer> result = postorderTraverse(root);
		
		for(int a: result) {
			System.out.println(a);
		}
		//System.out.println(sd);

	}
	
	

	private static List<Integer> postorderTraverse(TreeNode root) {
		if(root==null) return null;
		
		postorderTraverse(root.left);
		
		postorderTraverse(root.right);
		li.add(root.val);
		
		return li;
		
	}

	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val){
			this.val = val;
		}
		
		TreeNode(int val, TreeNode left, TreeNode right){
			this.val = val;
			this.left = left;
			this.right = right;
		}

}
	
}
