package java1;

import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);

     //sum of array

     int array[] = {1,2,3,4,5};
     
     int sum =0;
     for(int i=0; i<array.length; i++) {
    	 
    	 sum += array[i];
    	 
     }
     System.out.println(sum);
     
     
     //Copying an array
     
     int source[] = {1,2,3,4,5};
     int destination[] = new int[5];
     
     for(int i =0; i< source.length; i++) {
    	 
    	 destination[i] = source[i];
    	 int array2 = destination[i];
    	 
    	 System.out.println(array2);
    	 
     }
     
    // find the minimum and maximum in the array
     
     int min_max[] = new int[5];
     for(int i=0; i<min_max.length; i++) {
    	 
    	 System.out.println("Enter ellement: ");
    	 min_max[i] = sc.nextInt();
    	 
    	int highest = min_max[0];
    	int smallest = min_max[0];
    	
    	for(int j =0; j<min_max.length; j++) {
    		if(min_max[i]> highest) {
    			highest = min_max[i];
    		}
    		else if(min_max[i]< smallest) {
    			smallest = min_max[i];
    		}
    	}
    	 
    	System.out.println(highest);
    	System.out.println(smallest);
    	
     }
     
     //multiplication table using 2d array
     
     int table[][] ={ {1,2,3,4},{5,6,7,8}};
     
     for(int i=0; i< table.length; i++) {
    	
    	 for(int j=0; j<table[i].length; j++) {
    		 
    		 int result = table[i][j];
    		 
    		 System.out.println(result);
    	 }
     }
    
    
	}

}
