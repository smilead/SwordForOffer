package org.smilead.swordoffer.problem024;
import java.util.ArrayList;

public class Problem024 {
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		if(root == null) {
			return list;
		}

		if(root.left == null && root.right == null&& root.val == target) {
			ArrayList<Integer> path = new ArrayList<>();
			path.add(root.val);
			list.add(path);
			return list;
		}
				
		if(root.left!=null) {
			ArrayList<Integer> path1 = new ArrayList<>();
			path1.add(root.val);
			addPath(list, path1, root.left,root.val, target);
		}
		if(root.right!= null) {
			ArrayList<Integer> path2 = new ArrayList<>();
			path2.add(root.val);
			addPath(list, path2,root.right, root.val, target);
		}
		
		return list;
    }
	public void addPath(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> path,TreeNode node,int nowValue,int target) {
		nowValue= nowValue+node.val;
		path.add(node.val);
		if(node.left == null && node.right == null & nowValue == target) {
			list.add(path);
		}
		if(node.left!=null) {
			ArrayList<Integer> path1= new ArrayList<>(path);
			addPath(list, path1, node.left, nowValue, target);
		}
		if(node.right!=null) {
			ArrayList<Integer> path2 = new ArrayList<>(path);
			addPath(list, path2, node.right, nowValue, target);
		}
	}
	public static void main(String[] args) {
		new Problem024().FindPath(new TreeNode(1), 1);
	}
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
