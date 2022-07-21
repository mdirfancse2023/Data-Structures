import java.util.Scanner;
class ShellSort{
	void sort(int arr[], int n){
		
	}
}

public class ShellSortDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. of Elements");
		int n  = sc.nextInt();
		int arr[] = new int[n];
		ShellSort ss = new ShellSort();
		System.out.println("Enter the Unsorted Array");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		ss.sort(arr,n);
		System.out.println("Sorted Array Is");
		for(int i = 0 ; i < n ; i++) {
			System.out.println(arr[i]);
		}

	}

}
