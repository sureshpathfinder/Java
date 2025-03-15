class Box {

// protect the instance variable;
//Only an instance of Box Class can access it

	private int size;

// Provide public getters and setters

	public int getSize() { return size; }

	public void setSize(int newSize) {
		size = newSize;
		}
}
