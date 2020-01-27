
class SelectionSort {
	
	int[] selectSort(int arr[]){
		for(int i=0; i<arr.length;i++) {
			int min_index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_index]) {
					min_index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
		return arr;
	}
	
	void display(int sortedArr[]) {
		for(int i=0;i<sortedArr.length;i++) {
			System.out.print(sortedArr[i]+" ");
		}
	}
	
	public static void main(String args[]) {
		int arr[]= {9,8,7,6,5,324,3,0,2,-1};
		SelectionSort SS=new SelectionSort();
		int sortedArr[]=SS.selectSort(arr);
		SS.display(sortedArr);
	}
}