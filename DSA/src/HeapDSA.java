/* Min Heap**/
//Parent->(i-1)/2 , LeftChild->(2*i+1) , RightChild->(2*i+2)

import java.util.*;

class MinHeap{
	ArrayList<Integer> arr = new ArrayList<>();
	void insert(int data) {
		if(arr.size()<=2) {
			if(arr.size()==0) {
				arr.add(data);
			}
			else if(data<arr.get(0)) {
				int n = arr.get(0);
				arr.set(0, data);
				arr.add(n);
			}
			else {
				arr.add(data);
			}
			
		}
		else {
			arr.add(data);
			heapify();
		}
		
	}
	void delete() {
		if(arr.size()==1) {
			 arr.remove(0);
		}
		else {
			//int j = arr.get(0);
			int n = arr.remove(arr.size()-1);
			arr.set(0, n);
			heapify();
			//return j;
		}
		
	}
	void heapify() {
		int i = arr.size()-1;
		while(i>0) {
			if(arr.get(i)<arr.get((i-1)/2)) {
				int n = arr.get((i-1)/2);
				arr.set((i-1)/2, arr.get(i));
				arr.set(i, n);
				i = arr.size()-1;
			}
			else if(arr.get(i-1)<arr.get((i-1)/2)) {
				int n = arr.get((i-1)/2);
				arr.set((i-1)/2, arr.get(i-1));
				arr.set(i-1, n);
				i = arr.size()-1;
			}
			else {
				i=(i-1)/2;
			}
		}
	}
	void display() {
		for(Integer e : arr) {
			System.out.println(e);
		}
	}
	
}

public class HeapDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MinHeap mh = new MinHeap();
		mh.insert(23);
		mh.insert(12);
		mh.insert(78);
		mh.insert(65);
		mh.insert(91);
		mh.insert(4);
		mh.display();
		
	}

}
