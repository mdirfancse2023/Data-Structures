import java.util.Scanner;
class QuickSort{
	int partition(int arr[] , int l, int h) {
		int piv = arr[l];
		int i = l;
		int j = h;
		while(i<j) {
			while(arr[i]<=piv&&i<h) {
				i++;
			}
			while(arr[j]>piv) {
				j--;
			}
			if(i<j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[j];
		arr[j] = arr[l];
		arr[l] = temp;
		return j;
	}
	void calling(int arr[], int l , int h) {
		if(l<h) {
			int pos = partition(arr,l,h);
			calling(arr,l,pos-1);
			calling(arr,pos+1,h);
		}
	}
}

public class QuickSortDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. of Elements");
		int n  = sc.nextInt();
		int arr[] = new int[n];
		QuickSort qs = new QuickSort();
		System.out.println("Enter the Unsorted Array");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		qs.calling(arr,0,arr.length-1);
		System.out.println("Sorted Array Is");
		for(int i = 0 ; i < n ; i++) {
			System.out.println(arr[i]);
		}
	}

}
