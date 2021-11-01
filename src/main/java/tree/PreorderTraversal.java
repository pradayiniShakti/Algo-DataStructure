package tree;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
	 static List<Integer> li = new ArrayList<Integer>();
	public static void main(String[] args) {
		PreorderTraversal ld = new PreorderTraversal();
		TreeNode root;
		root = new TreeNode(1);
		//root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		//root.left.right = new TreeNode(5);
		List<Integer> result = preorderTraverse(root);
		
		for(int a: result) {
			System.out.println(a);
		}
		//System.out.println(sd);

	}
	
	

	private static List<Integer> preorderTraverse(TreeNode root) {
		if(root==null) return li;
		li.add(root.val);
		preorderTraverse(root.left);
		preorderTraverse(root.right);
		
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
