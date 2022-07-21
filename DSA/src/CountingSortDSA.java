import java.util.Scanner;
class CountingSort{
	void countsort(int arr[],int range,int size) {
		int count_arr[] = new int[range];
		int out_arr[] = new int[size];
		for(int i = 0 ; i < range ; i++) {
			count_arr[i] = 0;
		}
		for(int i = 0 ; i < size ; i++) {
			count_arr[arr[i]]++;
		}
		for(int i = 1 ; i < range ; i++) {
			count_arr[i] += count_arr[i-1];
		}
		for(int i = 0 ; i < size ; i++) {
			out_arr[count_arr[arr[i]]--]=arr[i];
		}
		for(int i = 0 ; i < size ; i++) {
			arr[i] = out_arr[i];
		}
		
	}
}

public class CountingSortDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range of No.");
		int r  = sc.nextInt();
		System.out.println("Enter the Size of Array");
		int n  = sc.nextInt();
		int arr[] = new int[n];
		CountingSort cs = new CountingSort();
		System.out.println("Enter the Unsorted Array in 0 to " + (r-1) + " Range Only");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		cs.countsort(arr,r,n);
		System.out.println("Sorted Array Is");
		for(int i = 0 ; i < n ; i++) {
			System.out.println(arr[i]);
		}

	}

}
