import java.util.HashMap;

class AccessHashMapElements {
	public static void main(String[] args) {
		HashMap<String, Integer> numbers = new HashMap<>();

		numbers.put("One", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);

		System.out.println("HashMap " + numbers);

		// Using entrySet()
		System.out.println("Key/Values mapping " + numbers.entrySet());

		// Using keySet()
		System.out.println("Keys " + numbers.keySet());

		// Using values()
		System.out.println("Values " + numbers.values());
	}
}
