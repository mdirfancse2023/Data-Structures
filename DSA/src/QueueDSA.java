import java.util.Scanner;

class Queue{
	int front = -1;
	int rear = -1;
	int dequeue(int arr[]){
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else if(front==rear){
			int ele = arr[front];
			arr[front]=0;
			front = -1;
			rear = -1;
			return ele;
		}
		else{
			int ele = arr[front];
			arr[front]=0;
			front++;
			return ele;
		}
		return -1;
		
	}
	void enqueue(int arr[] ,int ele){
		if(isFull()) {
			System.out.println("Queue is Full");
		}
		else if(isEmpty()){
			rear++;
			front++;
			arr[rear]=ele;
		}
		else {
			rear++;
			arr[rear]=ele;
		}
	}
	boolean isFull() {
		if(rear==4) {
			return true;
		}
		return false;
	}
	boolean isEmpty() {
		if(rear==-1) {
			return true;
		}
		return false;
	}
	void display(int arr[]) {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("No of elements is "+(rear-front+1));
	}
}
public class QueueDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue obj = new Queue();
		Scanner sc = new Scanner(System.in);
	      int arr[] = new int[5];
	      for(int i = 0 ; i < 5 ; i++) {
	    	  arr[i]=0;
	      }
	      int input;
	       do{
	        System.out.println("Which Operation You Wish To Perform");
	        System.out.println("1. Enqueue");
	        System.out.println("2. Dequeue");
	        System.out.println("3. Display");
	        System.out.println("0. Exit");
	        input = sc.nextInt();
	        if(input==1){
	            System.out.println("Enter the Element");
	            int ele = sc.nextInt();
	            obj.enqueue(arr,ele);
	        }
	        else if(input==2){
	            int val = obj.dequeue(arr);
	            System.out.println("Removed Element is : "+val);
	        }
	        else if(input==3){
	        	obj.display(arr);
	        }
	        else if(input==0) {
	        	break;
	        }
	        else{
	            System.out.println("Invalid Operation");
	        }
	    }
	    while(input!=0);

	}

}
