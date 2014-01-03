
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] array = new int[] {61,60,62,64,58,66,56,59,59,57,60,53,55,54,50};
		int[] array = new int[] {61,60,62,10,64,58,15,66,56,59,59,22,44,57,60,53,55,54,50,46,51,49,48,44,45,43,41,40,42,35,39,31,28,33,32,37,38,23,21,22,19,15};
		int lastElement = (array.length-1);
		System.out.println("array length: " + array.length);
	//	System.out.println("array length/2: " + Math.round(array.length/2));		
		for (int n=0; n<array.length-1;n++){
			//need to create a test here that will pass and print if all 
			//(array[n] > array[n+1]), or start another recursion if not	
			

			//create distinct sections of the array
			int sections = (int) Math.pow(2,n);
			//int sections = 1;
			// if each section has more than one element 
			// iterate through those elements 
			if (sections < array.length) {
				System.out.println("STARTING OVER " + n );
				System.out.println("SECTIONS: " + sections);
				for (int s=0; s<sections; s++) {
					// get number of elements in each section
					// add one to make sure you don't miss any at the end
					int size = 1+Math.round((array.length)/sections);
				//	int set =  size - pivot;
					
					System.out.println("");
					System.out.println("SECTION: " + s);
					System.out.println("SIZE: " + size);
				
					//set pivot point for each section
					int pivot = (size*s + Math.round(size/2));
					if (pivot < array.length){ 
					System.out.println("PIVOT: array[" + pivot + "]::" +array[pivot]);
					System.out.println("");
					
					for (int k : array){
						System.out.print(k + ",");
					}
					System.out.println("");
					// iterate through each element in each section
					for (int i=0; i<size; i++) {
						int m = i+size*s;
						// reset tmpRight and tmpLeft = 0 for a given section 
						int tmpLeft = 0;
						int tmpRight = 0;
						// reset j = pivot+1 
						
						
						if (m <= pivot ){	
							//System.out.println("processing array[" + m + "]: " + array[m]);
							//System.out.println("");
							// if element is to the left of the pivot element
							//if (m < pivot) {
								//if array element is bigger than pivot, put in tmp integer
								if (array[m] > array[pivot]) {
									tmpRight = array[m];
									System.out.println("tmpRight is now this: " + array[m]);
								
									// grab an element from the right of the pivot
									// to swap with tmp value
									//(j) to keep track of where you are to the right of the pivot
									for (int j = (size*(s+1)-1);j >= pivot; j--) {
										
										if (j > lastElement) {
											j = lastElement;
										}
									//	System.out.println("j is now: " + j);
										System.out.println("array[" + j + "]: " + array[j] + " pivot: " + array[pivot]);
										
										// if a value is less than the pivot, swap with the value that is greater
										if (array[j] < array[pivot] && j <= lastElement) {
											System.out.println("array[j] < array[pivot] was invoked");
											array[m] = array[j];
											array[j] = tmpRight;
											System.out.println("");
											System.out.println(array[m] + " < " + array[pivot] + " < " + array[j]);
											break;
										}

										// if you get all the way to the pivot without finding a replacement, 
										// then swap the left side value with the pivot
										else if (j == pivot) {
											System.out.println("array[m]: " + array[m] + " pivot: " + array[pivot]);
											tmpLeft = array[pivot];
											array[pivot] = array[m];
											array[m] = tmpLeft;
											System.out.println("got to the end without an array[j] < array[pivot]");
											System.out.println("PIVOT WAS SWAPPED");
											// must return to the start since the pivot was swapped
											i = -1;
											System.out.println("#############");
											System.out.println("i was set to -1, will aslo reset j = size*(s+1)-2");
										//	break;
										}
									
									}
								}
								else if (array[m] < array[pivot]) {
									System.out.println("NO CHANGE: array[" + m + "]: " + array[m] + " pivot: " + array[pivot]);
									
								}
								else if (array[m] == array[pivot]) {
									System.out.println("PIVOT array[" + m + "]: " + array[m] + " pivot: " + array[pivot]);
								}
								//System.out.println("");
							}
							// now assume all elements on the left are in place
							// still need to clean up the right side
							else if (m > pivot && m <= lastElement) {
							//	System.out.println("$$$$$$$$$$$$$$$$$");
								if (array[m] < array[pivot]) {
									System.out.println(array[m] + " < " + array[pivot]);
									tmpRight = array[pivot];
									System.out.println("tmpRight is now: " + tmpRight);
									array[pivot] = array[m];
									array[m] = tmpRight;
									System.out.println("pivot was SWAPPED, and 'I' was decremented");
									System.out.println(array[m] + " is now greater than: " + array[pivot]);
									// if you trade the pivot, you must re-run through this section
									i = -1;
								}
								else if (array[m] > array[pivot]) {
									System.out.println(array[m] + " is greater than: " + array[pivot] + " NO CHANGE");
									//tmpArray.add(array[pivot-1]);
								}
								else if (array[m] == array[pivot]) {
									System.out.println(array[m] + " is pivot");
								}
							}
					
						
					}
					
						//sections = sections*2;
						
					
					for (int k : array){
						System.out.print(k + ",");
					}
					System.out.println("");
					
						
					}
					
				}	
			
			
		

			}
		}
	
	}
}
			
	

	

