/// you may use this file to write and run code to test your code

/**
 * The main class to demonstrate the usage of the MyQueue implementation.
 */
public class Main {
    public static void main(String[] args) {
        // Create an instance of MyQueue
        MyQueue queue = new MyQueue();

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Dequeue an element
        Object dequeuedItem = queue.dequeue();
        System.out.println("\n" + "Dequeued item: " + dequeuedItem);

        // Peek the front element
        Object frontItem = queue.peek();
        System.out.println("Front item: " + frontItem);

        // Get the index of an element
        int index = queue.indexOf(2);
        System.out.println("Index of 2: " + index);

        // Get the size of the queue
        int size = queue.size();
        System.out.println("Size of queue: " + size);

        // Check if the queue is empty
        boolean empty = queue.isEmpty();
        System.out.println("Is queue empty? " + empty);
    }
}
