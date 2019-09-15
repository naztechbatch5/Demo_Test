package ArrayProgram.ArrayProgram;

public class BubbleSortExample {
	
	public static void main(String[] args) {
		int [] arr= {3,2,1,4,5,6,2,3,4};
		System.out.println("Before sort");
		for(int i :arr)
			System.out.print(i+" ");
		System.out.println();
		 selectionSort(arr);	
		 for(int i :arr)
				System.out.print(i+" ");
	}

	private static void selectionSort(int[] arr) {

        for(int i=0;i<arr.length;i++) {
        	int index=i;
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[j]<arr[index]) {
        			index=j;
        		}
        	}
        	
        	int smallerValue=arr[index];
        	arr[index]=arr[i];
        	arr[i]=smallerValue;
        }
		
	}

}
