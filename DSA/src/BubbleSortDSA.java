import java.util.Scanner;

class BubbleSort{
	void sort(int arr[]){
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for(int j = 0 ; j < arr.length-i-1 ; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
		}
		}
		System.out.print("Sorted Array Is : ");
		for(int k = 0 ; k < arr.length ; k++) {
			System.out.print(arr[k]+" ");;
		}
	}
}

public class BubbleSortDSA {

	public static void main(String[] args) {
		BubbleSort bb = new BubbleSort();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No. of Elements");
		int n  = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Unsorted Array");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		bb.sort(arr);

	}

}
