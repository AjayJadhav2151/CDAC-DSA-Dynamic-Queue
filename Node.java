package DynamicQueue;

public class Node {
	private int data;
	private Node next;
	
	public Node() {
		data=0;
		next=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node value) {
		this.next = value;
	}	
}
