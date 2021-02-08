// let make a method which will take user input and return the linkedlist 

import java.util.Scanner;
public class LinkedList{
	
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
		
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();

	}
	
	//Insert node in the linkedlist on a specific position
	public static void insert(Node<Integer> head,int data,int pos){
		Node<Integer> newNode = new Node<>(data);
		int i=0;
		if(pos==0){
			newNode.next = head;
			head = newNode;
			return;
		}
		Node<Integer> temp = head;
		while(i<pos-1){
			temp=temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	public static int length(Node<Integer> head){
		Node<Integer> temp = head;
		int count=0;
		while(temp!=null){
			count++;
			temp = temp.next;
		}
		return count;
	}
	public static void main(String[] args){
		Node<Integer> head=takeInput();
		insert(head,80,3);
		print(head);
		System.out.println(length(head));
	}
}