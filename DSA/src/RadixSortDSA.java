import java.util.Scanner;

class RadixSort{
	void countsort(int arr[], int size, int div) {
		int count_arr[] = new int[10];
		int out_arr[] = new int[size];
		for(int i = 0 ; i < 10 ; i++) {
			count_arr[i] = 0;
		}
		for(int i = 0 ; i < size ; i++) {
			count_arr[(arr[i]/div)%10]++;
		}
		for(int i = 1 ; i < 10 ; i++) {
			count_arr[i] += count_arr[i-1];
		}
		for(int i = size-1 ; i >= 0 ; i--) {
			out_arr[count_arr[(arr[i]/div)%10]-1]=arr[i];
			count_arr[(arr[i]/div)%10]--;
		}
		for(int i = 0 ; i < size ; i++) {
			arr[i] = out_arr[i];
		}
	}
	int getmax(int arr[], int n) {
		int max = arr[0];
		for(int i = 1 ; i < n ; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	void radixsort(int arr[], int n) {
		int max = getmax(arr,n);
		for(int div = 1 ; max/div>0 ; div*=10) {
			countsort(arr,n,div);
		}
	}
}
public class RadixSortDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. of Elements");
		int n  = sc.nextInt();
		int arr[] = new int[n];
		RadixSort rs = new RadixSort();
		System.out.println("Enter the Unsorted Array");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		rs.radixsort(arr,n);
		System.out.println("Sorted Array Is");
		for(int i = 0 ; i < n ; i++) {
			System.out.println(arr[i]);
		}

	}

}
