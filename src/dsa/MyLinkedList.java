package dsa;

public class MyLinkedList implements MyList {

	private Node head;
	private Node tail;
	private int myLength;

	@Override
	public void addAtBeginning(String data) {
		head = new Node(head, data);
		if (myLength == 0) {
			tail = head;
		}
		// add a new Node and set it to the head
		myLength++;

	}

	@Override
	public void removeFromBeginning() {
		head = head.getNext();
		myLength--;
	}

	@Override
	public void addAtEnd(String data) {
		if (myLength == 0) {
			head = new Node(head, data);
			tail = head;
		} else {
			Node newTail = new Node();
			tail.setNext(newTail);
			newTail.setData(data);
			tail = newTail;
			myLength++;
		}
	}

	@Override
	public void removeFromEnd() {
		if (myLength == 0) {
		} else if (myLength == 1) {
			head = null;
			tail = null;
		} else {
			secondToLastNode().setNext(null);

		}

		myLength--;

	}

	public Node secondToLastNode() {
		Node currentNode = head;
		boolean isSecondToLast;
		do {
			isSecondToLast = currentNode.getNext() == tail;
			if (isSecondToLast) {
				return currentNode;
			}
			currentNode = currentNode.getNext();

		} while (currentNode != null);

		return null;

	}

	@Override
	public String get(int index) {
		return null;
	}

	@Override
	public int size() {
		return myLength;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[ ");
		Node node = head;
		// follow the links between the nodes until it reaches the end
		while (node != null) {
			sb.append(node);
			node = node.getNext();
		}
		sb.append(" ]");

		return sb.toString();
	}
}
