//code to append last n nodes n the beginneing
import java.util.Scanner;
public class AppendNode{


	
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
		Node<Integer> temp = head;
		int count=0;
		while(temp!=null){
			temp = temp.next;
			count++;
		}
		return count;
	}

	public static Node<Integer> append(Node<Integer> head,int n){
		int i=1;
		Node<Integer> head2=null;
		int count = length(head)-n;
		Node<Integer> temp = head;
		while(i<=count){
			temp=temp.next;
			i++;
		}
		
		temp.next=head2;
		temp.next=null;
		Node<Integer> curr = head2;
		while(curr.next!=null){
			curr=curr.next;
		}
		curr.next = head;
		//tail.next=head;
		//tail=temp;
		return head2;
	}

	public static void print(Node<Integer> head){
		
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();

	}
	public static void main(String[] args){
		Node<Integer> head = takeInput();
		Node<Integer> head1=append(head,3);
		print(head1);
	}
}