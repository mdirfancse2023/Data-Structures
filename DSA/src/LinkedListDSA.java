class LinkedList{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
		
	}
	void add(int data){
		Node ele = new Node(data);
		if(isEmpty()) {
			head = ele;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = ele;
	}
	boolean isEmpty(){
		return head == null;
	}
	void print() {
		Node temp = head;
		while(temp!= null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	void delete() {
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		else {
			Node temp = head;
			while((temp.next).next!= null) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}
}
public class LinkedListDSA {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.delete();
		list.print();

	}

}
