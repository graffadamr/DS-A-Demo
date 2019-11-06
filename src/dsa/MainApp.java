package dsa;

public class MainApp {

	public static void main(String[] args) {

		MyArrayList list = new MyArrayList();
		list.addAtBeginning("hello");
		list.addAtBeginning("hello2");
		list.addAtBeginning("hello3");
		list.addAtBeginning("hello4");
		list.addAtEnd("hi");
		list.removeFromEnd();
		list.removeFromBeginning();
		
		System.out.println(list);
		
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addAtBeginning("help");
		linkedList.addAtBeginning("help2");
		linkedList.addAtBeginning("help3");
		linkedList.addAtBeginning("help4");
		linkedList.removeFromBeginning();
		linkedList.addAtEnd("helpyyyy");
		linkedList.removeFromEnd();
		System.out.println(linkedList);

	}

}
