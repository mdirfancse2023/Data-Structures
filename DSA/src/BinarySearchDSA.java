
public class BinarySearchDSA {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int search_ele = 5;
		boolean ans = false;
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid]==search_ele){
				System.out.println(mid);
				ans = true;
				break;
			}
			else if(arr[mid]<search_ele){
				left = mid + 1;
			}
			else{
				right = mid - 1;
			}
		}
		if(ans==false) {
			System.out.println("No Element Found");
		}

	}

}
