package dsa;

import java.util.Arrays;

public class MyArrayList implements MyList {

	private String[] arr = new String[4];
	private int myLength = 0;

	// we will use this method as a helper method inside this class
	private boolean isFull() {
		return arr.length == myLength;
	}

	// we will use this as a helper method as well to dynamically increase the size
	// of the
	// array
	private void doubleLength() {
		// make a copy of the array that is twice as long
		arr = Arrays.copyOf(arr, arr.length * 2);
	}

	@Override
	public void addAtBeginning(String data) {
		if (isFull()) {
			doubleLength();
		}

		// loop backwards and shift all the items over to make room for the new data
		for (int i = myLength; i > 0; i--) {
			arr[i] = arr[i - 1]; // this is assigning the element that was before it to the new index
		}
		arr[0] = data;
		myLength++;
	}

	@Override
	public void removeFromBeginning() {
		for (int i = 0; i < myLength; i++) {
			arr[i] = arr[i + 1];
		}
		myLength--;
	}

	@Override
	public void addAtEnd(String data) {
		if (isFull()) {
			doubleLength();
		}
		arr[myLength] = data;
		myLength++;
	}

	@Override
	public void removeFromEnd() {
		if (myLength != 0) {
			arr[myLength - 1] = null;
			myLength--;
		}
	}
	
	//public boolean removeAt (int index) {
	//	if (myLength != 0) {
	//		for (int i = index; i <myLength; i++) {
	//		}
	//	} else {
	//		return false;
	//		
	//	}
	//}

	@Override
	public String get(int index) {
		if (index >= myLength) {
			throw new ArrayIndexOutOfBoundsException("index out of bounds");
		}
		return arr[index];
	}

	@Override
	public int size() {
		return myLength;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[ ");
		for (int i = 0; i < myLength; i++) {
			sb.append(arr[i]);
			if (i != myLength - 1) {
				sb.append(", ");
			}
		}
		sb.append(" ]");
		return sb.toString();
	}

}
