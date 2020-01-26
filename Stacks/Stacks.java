class Stacks {
	Node top =null;

	void insert(Node n) {
		if (top==null) {
			top=n;
		}
		else {
			n.next=top;
			top=n;
		}
	}
	
	void display() {
		System.out.print("Elements in stack:\n");
		while(top!=null) {
			System.out.println(top.x);
			top=top.next;
		}
	}
	
	public static void main(String args[]) {
		Stacks s=new Stacks();
		s.insert(new Node(1));
		s.insert(new Node(2));
		s.insert(new Node(3));
		s.insert(new Node(4));
		s.insert(new Node(5));
		s.insert(new Node(6));
		s.display();
	}
}