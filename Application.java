package CS215_queues;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue = new Queue<>();
		
		System.out.println("Welcome to VegeBurger Palace! Please join our queue to order your tasty plant burger.\n");
		
		/**
		 * Add customers to the queue
		 */
		queue.enqueue("Bill");
		queue.printQueue();
		
		queue.enqueue("Alice");
		queue.printQueue();
		
		queue.enqueue("Bob");
		queue.printQueue();
		
		/**
		 * Serve the first customer in the queue
		 */
		queue.dequeue();
		queue.printQueue();
		
		/**
		 * More customers arrive
		 */
		queue.enqueue("Jane");
		queue.printQueue();
		
		queue.enqueue("Hamad");
		queue.printQueue(); 
		
		/**
		 * Two more customers are served
		 */
		queue.dequeue();
		queue.printQueue();
		
		queue.dequeue();
		queue.printQueue();
		
		/**
		 * Another customer arrives
		 */
		queue.enqueue("Jim");
		queue.printQueue();
		
		/**
		 * Two more customers are served
		 */
		queue.dequeue();
		queue.printQueue();
		
		queue.dequeue();
		queue.printQueue();
		
	} //end main

} //end class
