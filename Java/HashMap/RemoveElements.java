import java.util.HashMap;

class RemoveElements {
    	public static void main(String[] args) {

        	HashMap<String, Integer> numbers = new HashMap<>();
        	numbers.put("One", 1);
        	numbers.put("Two", 2);
        	numbers.put("Three", 3);
        	System.out.println("HashMap: " + numbers);

        	// remove method with single parameter
        	int value = numbers.remove("Two");
        	System.out.println("Removed value: " + value);

        	// remove method with two parameters
        	boolean result = numbers.remove("Three", 3);
        	System.out.println("Is the entry Three removed? " + result);

        	System.out.println("Updated HashMap: " + numbers);
    	}
}
