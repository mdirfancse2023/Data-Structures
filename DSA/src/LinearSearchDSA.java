public class LinearSearchDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		boolean ans = false;
		int search_ele = 3;
		for(int i = 0 ; i < arr.length ; i++) {
			if(search_ele == arr[i]) {
				System.out.println(i);
				ans = true;
				break;
			}
		}
		if(ans==false) {
		System.out.println("No Element Found");
		}

	}

}
