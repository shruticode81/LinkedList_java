//code to find a node in a linkedlist
import java.util.Scanner;
public class FindNode{
	
	public static Node<Integer> takeInput(){ //it returns head of the LL formed
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null,tail = null;
		while(data != -1){
			Node<Integer> newNode = new Node<Integer>(data);
			if(head==null){
				head = newNode;
				tail = newNode;
			}else{
				//Node<Integer> temp = head;
				//while(temp.next!=null){ // it case of while time complexity is O(n^2)
				//	temp=temp.next;
				//}
				//temp.next = newNode;
				tail.next = newNode;
				tail = tail.next; // by using tail node the time complexity is O(n)
			}
			data = s.nextInt();
		}
		return head;
	}

	public static int find(Node<Integer> head,int n){
		Node<Integer> temp = head;
		int pos = 0;
		while(temp!=null){
			if(temp.data==n){
				return pos;
			}
			pos++;
			temp=temp.next;
		}
		return -1;
		
	}
	public static void main(String[] args){
		Node<Integer> head =takeInput();
		System.out.println(find(head,5));
	}
	
}