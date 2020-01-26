import java.util.ArrayList;

public class TreeNode {
	int value;
	ArrayList<TreeNode> child;
	
	TreeNode(int value){
		this.value=value;
		child=new ArrayList<TreeNode>();
	}
}