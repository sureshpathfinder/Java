public class thiscontr {

	int length;
	int breadth;
	int height;
	public int getVolume() {
		return (length * breadth * height);
	}
	thiscontr() {
		this(10, 10);
		System.out.println("Finished with Default Constructor");
	}
	thiscontr(int l, int b) {
		this(l, b, 10);
		System.out.println("Finished with Parameterized Constructor having 2 params");
	}
	thiscontr(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
		System.out.println("Finished with Parameterized Constructor having 3 params");
	}
	public static void main(String[] args) {
		thiscontr cubeObj1, cubeObj2;
		cubeObj1 = new thiscontr();
		cubeObj2 = new thiscontr(10, 20, 30);
		System.out.println("Volume of Cube1 is : " + cubeObj1.getVolume());
		System.out.println("Volume of thiscontr is : " + cubeObj2.getVolume());
	}
}

