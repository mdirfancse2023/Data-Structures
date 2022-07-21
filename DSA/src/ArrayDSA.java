import java.util.Scanner;

class Array{
	int top = -1;
	void delete(int arr[],int pos) {
		if(isEmpty()) {
			System.out.println("Array is Empty");
		}
		else {
			arr[pos-1]=0;
			top--;
			System.out.println("Element Deleted Successfully");
		}
		
	}
	void update(int arr[],int pos,int val) {
		if(isEmpty()) {
			System.out.println("Array is Empty");
		}
		else {
			arr[pos-1]=val;
			System.out.println("Element Updated Successfully");
		}
		
	}
	void display(int arr[]) {
		for(int i = 0 ; i < 10 ; i++) {
	    	  System.out.print(arr[i]+" ");
	     }
	}
	void insert(int arr[],int pos,int val) {
		if(isEmpty()) {
			top++;
			arr[pos-1]=val;
			System.out.println("Element Inserted Successfully");
		}
		else if(isFull()) {
			System.out.println("Array is Full");
		}
		else{
			for(int i = arr.length-2 ; i >= pos-1 ; i--) {
				if(arr[i]!=0) {
					arr[i+1]=arr[i];
				}
			}
			top++;
			arr[pos-1] = val;
			System.out.println("Element Inserted Successfully");
		}
	}
	boolean isFull() {
		if(top==9) {
			return true;
		}
		return false;
	}
	boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
}
public class ArrayDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array ar = new Array();
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i = 0 ; i < 10 ; i++) {
	    	  arr[i]=0;
	      }
		int input,pos,val;
		do {
			System.out.println("Which Operation You Wish To Perform");
	        System.out.println("1. Insert");
	        System.out.println("2. Delete");
	        System.out.println("3. Updation");
	        System.out.println("4. Display");
	        System.out.println("0. Exit");
	        input = sc.nextInt();
	        switch(input){
	        	case 0:
	        		break;
	        	case 1:
	        		System.out.println("Enter the position(1 to 10) where you wish to insert");
	        		pos = sc.nextInt();
	        		System.out.println("Enter the value you wish to insert");
	        		val = sc.nextInt();
	        		ar.insert(arr,pos,val);
	        		break;
	        	case 2:
	        		System.out.println("Enter the position(1 to 10) where you wish to delete");
	        		pos = sc.nextInt();
	        		ar.delete(arr,pos);
	        		
	        		break;
	        	case 3:
	        		System.out.println("Enter the position(1 to 10) where you wish to update");
	        		pos = sc.nextInt();
	        		System.out.println("Enter the value you wish to update");
	        		val = sc.nextInt();
	        		ar.update(arr,pos,val);
	        		break;
	        	case 4:
	        		ar.display(arr);
	        		break;
	        	default:
	        		System.out.println("Invalid Operation");
	        		break;
	        		
	        }
			
		}while(input!=0);

	}

}
