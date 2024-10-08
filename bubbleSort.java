package bubbleSort;

public class bubbleSort {

	public static void main(String[] args) {
		
		 int array[] = {4,8,90,34,1,56,83};
		 
		 sortList(array);
			
			for(int i : array) {
				
				System.out.println(i);
			}
	}

	private static void sortList(int[] array) {
		
		for(int i= 0; i<= array.length-1; i++) {
			
			
			for(int j = 0; j<array.length-i-1; j++) {
			
				if(array[j] > array[j+1]) {
					
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
		   
		}
	}

}
