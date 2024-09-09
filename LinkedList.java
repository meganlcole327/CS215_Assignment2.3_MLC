package CS215_queues;
/**
 * @author njohnson3/Megan Cole
 *
 */
public class LinkedList<T> {
	
	GenericNode <T> head;
	int length;
	GenericNode<T> tail;
	
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	} //end constructor
	
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	} //end isEmpty
	
	public GenericNode <T> getList()
	{
		return head;
	} //end getList
	
	public void addNode(GenericNode <T> aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		 tail.setNextNode(aNode);
	        tail = tail.getNextNode();
	        length++;
	    } //end addNose


} //end class
