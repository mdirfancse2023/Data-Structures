import java.util.*;
class Stack{
	int pos = -1;
	boolean isFull(int arr[]){
        if(pos==4){
            return true;
        }
        return false;
    }
    boolean isEmpty(int arr[]){
        if(pos==-1){
            return true;
        }
        return false;
    }
    int pop(int arr[]){
        if(isEmpty(arr)){
            System.out.println("Underflow Error");
        }
        else{
            int temp = arr[pos];
            pos--;
            return temp;
        }
        return 0;
        
    }
    void push(int arr[],int ele){
        if(isFull(arr)){
            System.out.println("Overflow Error");
        }
        else{
            pos++;
            arr[pos] = ele;
            System.out.println("Element Pushed Successfull");
        }
    }
    void display(int arr[]){
        for(int i = 0 ; i <= pos ; i++) {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void peek(int arr[]){
    	if(isEmpty(arr)){
            System.out.println("Stack is Empty");
        }
    	else {
    		System.out.println("Top Element is : "+arr[pos]);
    	}
    	
    }
}
public class StackDSA {
	
	public static void main(String[] args) {
		Stack obj = new Stack();
		Scanner sc = new Scanner(System.in);
	      int arr[] = new int[5];
	      for(int i = 0 ; i < 5 ; i++) {
	    	  arr[i]=0;
	      }
	      int input;
	       do{
	        System.out.println("Which Operation You Wish To Perform");
	        System.out.println("1. Push");
	        System.out.println("2. Pop");
	        System.out.println("3. Peek");
	        System.out.println("4. Display");
	        System.out.println("0. Exit");
	        input = sc.nextInt();
	        if(input==1){
	            System.out.println("Enter the Element");
	            int ele = sc.nextInt();
	            obj.push(arr,ele);
	        }
	        else if(input==2){
	            int val = obj.pop(arr);
	            System.out.println("Poped Element is : "+val);
	        }
	        else if(input==3){
	        	obj.peek(arr);
	        }
	        else if(input==4){
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
