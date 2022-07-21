import java.util.Scanner;
class InsertionSort{
	void sort(int arr[]){
		for(int i = 1 ; i < arr.length ; i++){
			for(int j = 0 ; j < i ; j++){
				if(arr[j]>arr[i]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}	
		}
		System.out.print("Sorted Array Is : ");
		for(int k = 0 ; k < arr.length ; k++) {
			System.out.print(arr[k]+" ");;
		}
	}
}
public class InsertionSortDSA {
	public static void main(String[] args) {
		InsertionSort ss = new InsertionSort();
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
