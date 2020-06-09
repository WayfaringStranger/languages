import java.util.HashMap;

class Maps {
	public static void main(String[] args) {
		// Creating a hashmap of even numbers
		HashMap<String, Integer> evenNumbers = new HashMap<>();
		evenNumbers.put("Two", 2);
		evenNumbers.put("Four", 4);
		System.out.println("HashMap1: " + evenNumbers);

		// Creating a hash map from other HashMap
		HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
		numbers.put("Three", 3);
		System.out.println("HashMap2: " + numbers);
	}
}
