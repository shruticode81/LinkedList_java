//check if a linkedlist is a palindrome
// input --> 3 2 2 3  output -->true

import java.util.Scanner;
public class CheckPalindrome{

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
	//method to check palindrome using recursion
	static Node<Integer> left ;
	public static boolean palindrome(Node<Integer> right){
		//base case if right == null
		if(right==null){
			return true;
		}
		boolean smallans = palindrome(right.next);
		if(smallans == false){
			return false;
		}
		else if(right.data!=left.data){
			return false;
		}
		else{
			left=left.next;
			return true;
		}
	}
	public static void main(String[] args){
		Node<Integer> head=takeInput();
		left = head;
		System.out.println(palindrome(head));
	}

}