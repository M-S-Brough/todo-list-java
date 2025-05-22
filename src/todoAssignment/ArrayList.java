package todoAssignment;

public class ArrayList implements List {

	// Objects that are stored in the arraylist
	private Object[] arrayList;
	// how many objects are stored
	private int elementsInArray;

	/*
	 * Default constructor which creates an arraylist with the size 10
	 */
	public ArrayList() {
		this(10);
	}

	/*
	 * Constructor which takes the size of the as a parameter. Checks to see if the
	 * size is equal to or above zero
	 */
	public ArrayList(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("Illegal Capacity: " + n);

		}

		this.arrayList = new Object[n];
		this.elementsInArray = 0;
	}

	/*
	 * Method that adds object to arraylist. If arraylist is full it doubles
	 * capacity
	 */
	@Override
	public void add(Object obj) {
		if (checkIfArrayFull()) {
			copyArray(0, "double");
		}

		this.arrayList[this.elementsInArray] = obj;
		this.elementsInArray++;
	}

	/*
	 * Method that adds object to arraylist in a given index
	 */
	@Override
	public void add(int index, Object obj) {
		if (checkIfArrayFull()) {
			copyArray(0, "double");
		}

		if (index >= this.arrayList.length) {
			System.out.println("The index is out of bounds");
			System.exit(-1);
		}

		Object temp = this.arrayList[index];
		arrayList[index] = obj;

		Object temp2;

		for (int i = index; i < this.arrayList.length - 1; i++) {
			temp2 = arrayList[i + 1];
			arrayList[i + 1] = temp;
			temp = temp2;
		}

		copyArray(0, "");
		this.elementsInArray++;
	}

	/*
	 * Method that returns object by given index
	 */
	@Override
	public Object get(int index) {
		Object element = null;

		// Invariant: 0 <= index < arrayList.length
		try {
			element = this.arrayList[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The index that you specified is not within bounds.");
			System.exit(-1);
		}

		// String elementConv = element.toString();
		return element;
	}

	/*
	 * Method returns size of arraylist
	 */
	@Override
	public int size() {
		return this.elementsInArray;
	}

	/*
	 * Method checks if arraylist is empty
	 */
	@Override
	public boolean isEmpty() {
		return this.elementsInArray == 0;
	}

	/*
	 * Method that checks if an object is in the arraylist and returns true or false
	 */
	@Override
	public boolean isIn(Object ob) {
		return find(ob) >= 0;
	}

	/*
	 * Method that checks the index of object in arraylist
	 */
	@Override
	public int find(Object n) {
		// Invariant: 0 <= i < arrayList.length
		for (int i = 0; i < this.arrayList.length; i++) {
			if (n.equals(this.arrayList[i])) {
				return i;
			}
		}

		return -1;
	}

	/*
	 * Method that removes object from arraylist
	 */
	@Override
	public void remove(Object n) {
		// Invariant: 0 <= i < elementsInArray
		for (int i = 0; i < this.elementsInArray; i++) {

			this.arrayList[i] = null;
			this.elementsInArray--;
			copyArray(0, "");
			return;
		}
	}

	/*
	 * Method that checks if arraylist is full
	 */
	private boolean checkIfArrayFull() {
		return this.arrayList.length == this.elementsInArray;
	}

	/*
	 * Private method which doubles the arraylist in size
	 */
	private void copyArray(int size, String action) {
		size = increaseArraySize(size, action);

		Object[] tempArray = new Object[size];

		int tempElement = 0;

		// Invariants: 0 <= i < arrayList.length && 0 <= tempElement < arrayList.length
		for (int i = 0; i < this.arrayList.length; i++, tempElement++) {
			if (this.arrayList[i] == null) {
				tempElement--;
				continue;
			}

			tempArray[tempElement] = this.arrayList[i];
		}

		this.arrayList = null;
		this.arrayList = new Object[tempArray.length];
		this.arrayList = tempArray;
	}

	private int increaseArraySize(int size, String action) {
		if (action.equals("double")) {
			size = this.arrayList.length * 2;
		} else {
			size = this.arrayList.length + size;
		}

		return size;
	}

}
