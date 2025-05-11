package DynamicQueue;

public class DynamicQueue {
	private Node front;
	private Node rear;
	
	public DynamicQueue() {
		front = null;
		rear = null;
	}
	
	public Node create_node(int value) {
		Node newnode = new Node();
		newnode.setData(value);
		newnode.setNext(null);
		return newnode;
	}

	public int Enqueue(int value) {
		Node newnode = create_node(value);
		if(rear==null) {
			rear=front=newnode;
		} 
		else 
		{
			rear.setNext(newnode);
			rear=newnode;
		}
		return value;
	}
	
	public int Dequeue() {
		int value=-1;
		Node temp=front;
		if(front==null) {
			System.out.println("Queue is empty");
		} 
		else 
		{
			value = front.getData();
			front = front.getNext();
			temp.setNext(null);
		}
		return value;
	}
	
	public void display() {
		Node temp=front;
		while(temp!=null) {
			System.out.print("|"+temp.getData()+"|"+"->");
			temp = temp.getNext();
		}
		System.out.println("null");
	}
}
