public class Constructor {
	String name;
	// Constructor
	Constructor() {
		this.name = "terminal";
	}

	public static void main(String[] args) {
		Constructor object = new Constructor();
		System.out.println(object.name);
	}
}

