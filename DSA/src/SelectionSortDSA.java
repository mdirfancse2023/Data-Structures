import java.util.Scanner;
class SelectionSort{
	void sort(int arr[]){
		for(int i = 0 ; i < arr.length-1 ; i++) {
			int min = i;
			for(int j = i+1 ; j < arr.length ; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.print("Sorted Array Is : ");
		for(int k = 0 ; k < arr.length ; k++) {
			System.out.print(arr[k]+" ");;
		}
	}
}

public class SelectionSortDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort ss = new SelectionSort();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No. of Elements");
		int n  = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Unsorted Array");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		ss.sort(arr);

	}

}
