// This is the main class where the functionality of the 'MyStack' class is tested.

// The 'Main' class contains the 'main' method that serves as the entry point for running the test code.

public class Main {
    public static void main(String[] args) {
        // Create a new MyStack instance
        MyStack stack = new MyStack();

        // Push items onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Print the stack size
        System.out.println("\n" + "Stack size: " + stack.size()); // Output: 3

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false

        // Peek at the top item
        System.out.println("Top item: " + stack.peek()); // Output: Cherry

        // Pop items from the stack
        System.out.println("Popped item: " + stack.pop()); // Output: Cherry
        System.out.println("Popped item: " + stack.pop()); // Output: Banana

        // Print the updated stack size
        System.out.println("Stack size: " + stack.size()); // Output: 1

        // Search for an item in the stack
        System.out.println("Index of 'Apple': " + stack.indexOf("Apple")); // Output: 0
        System.out.println("Index of 'Banana': " + stack.indexOf("Banana")); // Output: -1

        // Pop the remaining item
        System.out.println("Popped item: " + stack.pop()); // Output: Apple

        // Check if the stack is empty after popping all items
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true
    }
}