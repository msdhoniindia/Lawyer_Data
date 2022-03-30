package dsa;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;	
	}
}

public class Single_Linked_list {
	 
	public static Node insert_node(Node head,int data) {
		
		if(head ==null) {
			head = new Node(data);
			return head;
		}else {
			while(head.next!=null) {
				head = head.next;
			}
			head = new Node(data);
			System.out.println("data is added "+head.data);
		}
		
		return head;
	}
	
	static void  Display(Node n) {
		Node start =n;
		while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
	}
	
	static boolean isCircular(Node head) {
		
		Node tr = null;
		if(head==null) {
			System.out.println("List is empty");
			
		}else {
			System.err.println(head.data);
			tr = head.next;
		while(tr!=head && tr!=null) {
			System.err.println(tr.data);
			tr = tr.next;
			
		}
		if(tr ==head)
		return true;
		else
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Node tail =null;
		Node n1 = new Node(10);
		Node n2 = new Node(5);
		Node n3 = new Node(3);
		n1.next=n2;
		n2.next=n3;
		Node newNode = insert_node(tail, 77);
		n3.next=newNode;
		tail = insert_node(tail,34);
		newNode.next = tail; // Linked_list = 10->5->3->77->34->null
		tail.next=n1; // Linked_list = 10->5->3->77->34->10
		//Display(n1);
		boolean b = isCircular(n1);
		System.err.println(b);
		
	}
}
