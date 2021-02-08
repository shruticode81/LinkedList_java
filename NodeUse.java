//create a nodeUse class to ceate actual node and perform operations

public class NodeUse{

	public static void print(Node<Integer> head){
		Node<Integer> temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String[] args){
		Node<Integer> node1 = new Node<>(10);
		//System.out.println(node1.data);
		//System.out.println(node1.next);
		Node<Integer> node2 = new Node<>(20);
		node1.next = node2;
		Node<Integer> node3 = new Node<>(30);
		node2.next = node3;
		Node<Integer> head = node1;
		print(head); 
		//print(node1);
		//System.out.println(node1.next);
		//System.out.println(node2);
	}
}