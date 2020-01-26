public class BST {
	public Node insert(Node root,int x) {
		if (root==null) {
			root=new Node(x);
			return root;
		}
		if(x<root.value) {
			root.left=insert(root.left,x);
		}
		else {
			root.right=insert(root.right,x);
		}
		return root;
	}
	
	public void display(Node root) {
		if (root==null) {
			return;
		}
		display(root.left);
		System.out.println(root.value);
		display(root.right);
	}
	public static int treeHeight(Node root) {
		if (root==null) {
			return 0;
		}
		int LeftH=treeHeight(root.left);
		int RightH=treeHeight(root.right);
		if(LeftH>RightH) {
			return LeftH+1;
		}
		else {
			return RightH+1;
		}
	}
	public static void main(String args[]) {
		Node Treeroot=null;
		BST bst=new BST();
		Treeroot=bst.insert(Treeroot,50);
		bst.insert(Treeroot, 30);
		bst.insert(Treeroot, 20);
		bst.insert(Treeroot, 40);
		bst.insert(Treeroot, 70);
		bst.insert(Treeroot, 60);
		bst.insert(Treeroot, 80);
		bst.insert(Treeroot, 90);
		bst.display(Treeroot);
		int TreeHeight=treeHeight(Treeroot);
		System.out.println("TreeHeight:"+TreeHeight);
		
	}
}