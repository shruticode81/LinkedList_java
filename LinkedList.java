// let make a method which will take user input and return the linkedlist 

import java.util.Scanner;
public class LinkedList{
	
	public static Node<Integer> takeInput(){ //it returns head of the LL formed
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null,tail = null;
		while(data != -2){
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

	public static int length(Node<Integer> head){
		Node<Integer> temp = head;
		int count=0;
		while(temp.data!=-1){
			count++;
			temp = temp.next;
		}
		return count;
	}
	public static void main(String[] args){
		Node<Integer> head=takeInput();
		print(head);
		System.out.println(length(head));
	}
}