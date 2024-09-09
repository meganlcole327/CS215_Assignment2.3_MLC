package CS215_queues;

public class Queue<T> {
	
	private LinkedList<T> list;
	
	/**
	 * instantiate the linked list for our queue
	 */
	public Queue() {
		list = new LinkedList<>();
	} //end constructor 
	
	/**
	 * Add an item to the queue
	 */
	public void enqueue(T data) {
		GenericNode<T> newNode = new GenericNode<>();
		newNode.setData(data);
		list.addNode(newNode); //adds the node to the linked list
		System.out.println("The following has been added to the queue: " + data);
	} //end enqueue
	
	/**
	 * Remove an item from a queue
	 */
	public T dequeue() {
		if (list.isEmpty()) {
			System.out.println("The queue is empty.");
			return null;
		}
		T data = list.getList().getData(); //get data from the head of the queue
		list.head = list.getList().getNextNode(); //move the head to the next node
		System.out.println("The following has been removed from the queue: " + data);
		return data;
	} //end dequeue
	
	/**
	 * Display the current queue
	 */
	public void printQueue() {
		GenericNode<T> currentNode = list.getList();
		if (currentNode == null) {
			System.out.println("The queue is empty.");
		} else {
			System.out.print("Queue: ");
			while (currentNode !=null) {
				System.out.print(currentNode.getData() + " ");
				currentNode = currentNode.getNextNode();
			}
			System.out.println();
		}
	} //end printQueue

} //end class
