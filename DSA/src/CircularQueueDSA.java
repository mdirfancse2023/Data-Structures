import java.util.Scanner;
class CircularQueue{
	int front = -1;
	int rear = -1;
	int Cdequeue(int arr[]){
		if(isCEmpty()) {
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
			front=(front+1)%5;  //New Condition
			return ele;
		}
		return -1;
		
	}
	void Cenqueue(int arr[] ,int ele){
		if(isCFull()) {
			System.out.println("Queue is Full");
		}
		else if(isCEmpty()){
			rear++;
			front++;
			arr[rear]=ele;
		}
		else {
			rear=(rear+1)%5; //New Condition
			arr[rear]=ele;
		}
	}
	boolean isCFull() {
		if((rear+1)%5==front) { //New Condition
			return true;
		}
		return false;
	}
	boolean isCEmpty() {
		if(rear==-1) {
			return true;
		}
		return false;
	}
	void Cdisplay(int arr[]) {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
//		System.out.print("No of elements is "+((rear+1)%5-(front+1)%5));
	}
	
}
public class CircularQueueDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue obj = new CircularQueue();
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
	            obj.Cenqueue(arr,ele);
	        }
	        else if(input==2){
	            int val = obj.Cdequeue(arr);
	            System.out.println("Removed Element is : "+val);
	        }
	        else if(input==3){
	        	obj.Cdisplay(arr);
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
