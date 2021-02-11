//code to print reverse of a linkedlist we just have to print not return any head of new reverse LL

import java.util.Scanner;

public class ReversePrint{

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
	public static int length(Node<Integer> head){
		int count=0;
		while(head!=null){
			count++;
			head=head.next;
		}
		return count;
	}
	private static Node<Integer> getNode(Node<Integer> head,int index){
		Node<Integer> temp = head;
		for(int i=0;i<index;i++){
			temp= temp.next;
		}
		return temp;
	}
	
	public static Node<Integer> reverseIterative(Node<Integer> head){
		int li=0;
		int ri = length(head)-1;
		while(li<ri){
			Node<Integer> left = getNode(head,li);
			Node<Integer> right = getNode(head,ri);
			int temp = left.data;
			left.data=right.data;
			right.data = temp;
			
			li++;
			ri--;
		}
		return head;
	} 
	// reverse iteratively
	public static void reverseLL(Node<Integer> head){
		//base case if head==null
		if(head==null){
			return;
		}
		reverseLL(head.next);
		System.out.print(head.data+" ");
	}
	//reverse using changing links using pointers
	public static Node<Integer> reversePointer(Node<Integer> head){
		Node<Integer> current = head;
		Node<Integer> previous = null;
		Node<Integer> next = null;
		while(current!=null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	public static void print(Node<Integer> head){
		while(head!=null){
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static void main(String[] args){
		Node<Integer> head = takeInput();
		//Node<Integer> head1=reverseIterative(head);
		Node<Integer> head1=reversePointer(head);
		print(head1);
		//reverseLL(head);
	}
}