class BubbleSort {
	int[] sort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {		
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	void display(int sortedArr[]) {
		for(int i=0;i<sortedArr.length;i++) {
			System.out.print(sortedArr[i]+" ");
		}
	}
	
	public static void main(String args[]) {
		int arr[]= {9,8,7,6,5,4,3,0,2,1};
		BubbleSort BS=new BubbleSort();
		
		int sortedArr[]=BS.sort(arr);
		BS.display(sortedArr);
	}
}