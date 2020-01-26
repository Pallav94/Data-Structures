import java.util.Scanner;

public class GenericTree {
	TreeNode inputLeveWise() {
		System.out.print("Enter root node:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		TreeNode root = new TreeNode(x);
		TreeQueue queue=new TreeQueue();
		queue.enqueue(new Node(root));
		System.out.println("QueuenSize:"+queue.queueSize());
		while (queue.queueSize() != 0) {
			Node n = queue.dequeue();
			System.out.println("-------------");
			System.out.print("Enter number of child for the TreeNode:");
			int nChilds = sc.nextInt();
			for (int i = 1; i <= nChilds; i++) {
				System.out.print("Enter value:");	
				x = sc.nextInt();
				TreeNode child = new TreeNode(x);
				n.root.child.add(child);
				queue.enqueue(new Node(child));
				System.out.println("QueuenSize:"+queue.queueSize());
			}
		}

		return root;
	}
	void display(TreeNode root) {
		System.out.println("Root:"+root.value);
		System.out.print("Child nodes:");
		for(int i=0;i<root.child.size();i++) {
			System.out.print(root.child.get(i).value+" ");
		}
		System.out.print("\n");
		for(int i=0;i<root.child.size();i++) {
			display(root.child.get(i));
		}
		
	}

	public static void main(String args[]) {
		GenericTree GT = new GenericTree();
		TreeNode root = GT.inputLeveWise();
		GT.display(root);
	}
}