import java.util.Scanner;
class OptimizeBubbleSort{
	
	void sort(int arr[]){
		for(int i = 0 ; i < arr.length-1 ; i++) {
			boolean flag = false;
			for(int j = 0 ; j < arr.length-i-1 ; j++) {
				if(arr[j]>arr[j+1]) {
					flag = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(flag==false) { //Already Sorted
				break;
			}
		}
		System.out.print("Sorted Array Is : ");
		for(int k = 0 ; k < arr.length ; k++) {
			System.out.print(arr[k]+" ");;
		}
	}
}

public class OptimizedBubbleSortDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptimizeBubbleSort Obb = new OptimizeBubbleSort();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No. of Elements");
		int n  = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Unsorted Array");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		Obb.sort(arr);

	}

}
