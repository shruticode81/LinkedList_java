//java code to remove duplicates if input linkedlink is in increasing order

import java.util.Scanner;

public class RemoveDuplicates{

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
	public static void print(Node<Integer> head){
		Node<Integer> temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static Node<Integer> remove(Node<Integer> head){
		Node<Integer> t1 = head;
		Node<Integer> t2 = head.next;
		if(head==null){
			return head;
		}
		while(t2!=null){
			if(t1.data.equals(t2.data)){
				t2=t2.next;
			}else{
				t1.next=t2;
				t1=t2;
				t2=t2.next;

			}
		}
		t1.next = t2;
		return head;
	}

	public static void main(String[] args){
		Node<Integer> head = takeInput();
		Node<Integer> head1=remove(head);
		print(head1);
	}
}