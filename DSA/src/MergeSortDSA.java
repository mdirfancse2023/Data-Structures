import java.util.Scanner;

class MergeSort{
	int n;
	MergeSort(int n){
		this.n = n;
	}
	void merge(int arr[],int l,int m, int r){
		int temp[] = new int[n];
		int i = l;   //pointer to the first array
		int j = m+1;  //pointer to the second array
		int k = l; //for iterating in temp array
		
		while(i<=m && j<=r) {
			if(arr[i]<arr[j]) {
				temp[k]=arr[i];
				k++;
				i++;
			}
			else {
				temp[k]=arr[j];
				k++;
				j++;
			}
		}
		while(j<=r) {
			temp[k]=arr[j];
			k++;
			j++;
		}
		while(i<=m) {
			temp[k]=arr[i];
			k++;
			i++;
		}
		for(int c = l; c<=r; c++) {
			arr[c] = temp[c];
		}
	}
	void divide(int arr[],int l,int r){
		if(l<r) {
			int m = (l+r)/2;
			divide(arr,l,m);
			divide(arr,m+1,r);
			merge(arr,l,m,r);
			
		}
	}
}
public class MergeSortDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No. of Elements");
		int n  = sc.nextInt();
		int arr[] = new int[n];
		MergeSort ms = new MergeSort(n);
		System.out.println("Enter the Unsorted Array");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		ms.divide(arr,0,arr.length-1);
		System.out.println("Sorted Array Is");
		for(int i = 0 ; i < n ; i++) {
			System.out.println(arr[i]);
		}

	}

}
