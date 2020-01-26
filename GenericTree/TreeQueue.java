
public class TreeQueue {
    
	Node front=null,rear=null;
    Node top;
	int queueSize=0;
	
	public void enqueue(Node node) {
		if(front==null) {
			front=node;
			rear=node;            			
		}
		else {
			rear.next=node;
			rear=node;
		}
		queueSize=queueSize+1;
		//System.out.println(queueSize);
		
	}
	public Node dequeue() {
		if(queueSize!=0) {
			top=front;
			front=front.next;
			queueSize=queueSize-1;
		}
		return top;
	}
	public int queueSize() {
		return queueSize;
	}
}
