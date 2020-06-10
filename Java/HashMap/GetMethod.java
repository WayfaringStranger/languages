import java.util.HashMap;

class GetMethods {
	public static void main(String[] args) {

		HashMap<String, Integer> numbers = new HashMap<>();
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);

		System.out.println("HashMap " + numbers);

		// Using get() 
		int value1 = numbers.get("Three");
        	System.out.println("Returned Number: " + value1);

        	// Using getOrDefault()
        	int value2 = numbers.getOrDefault("Five", 5);
        	System.out.println("Returned Number: " + value2);
	}
}
