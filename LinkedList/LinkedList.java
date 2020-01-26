
public class LinkedList {
	Node head=null;
	Node end=null;
	
	void insert(Node n) {
		if (head==null) {
			head=n;
			end=n;
		}
		else {
			end.next=n;
			end=n;
		}
	}
	void display() {
		while(head!=null) {
			System.out.print(head.value+" ");
			head=head.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList LL=new LinkedList();
		LL.insert(new Node(1));
		LL.insert(new Node(2));
		LL.insert(new Node(3));
		LL.insert(new Node(4));
		LL.insert(new Node(5));
		LL.insert(new Node(6));
		LL.insert(new Node(7));
		LL.display();
	}
}