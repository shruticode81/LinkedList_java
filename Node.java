// code to create a Node class which will be template of node and contain things to be in a node object.
//make the node class generic that it can get any non primitive type parameter.

public class Node<T>{
	T data;
	Node<T> next;

	public Node(T data){
		this.data = data;
		this.next = null;
	}
}