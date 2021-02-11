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
	public static void reverseLL(Node<Integer> head){
		//base case if head==null
		if(head==null){
			return;
		}
		reverseLL(head.next);
		System.out.print(head.data+" ");
	}
	public static void main(String[] args){
		Node<Integer> head = takeInput();
		reverseLL(head);
	}
}