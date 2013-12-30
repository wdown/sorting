
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {61,60,62,64,58,66,56,59,59,57,60,53,55,54,50};
		//		46,51,49,48,44,45,43,41,40,42,35,39,31,28,33,32,37,38,23,21,22,19,15};
		System.out.println("array length: " + array.length);
	//	System.out.println("array length/2: " + Math.round(array.length/2));		
		for (int n=0; n<array.length-1;n++){
			//need to create a test here that will pass and print if all 
			//(array[n] > array[n+1]), or start another recursion if not	
			

			//create distinct sections of the array
			int sections = (int) Math.pow(2,n);
			
			// if each section has more than one element 
			// iterate through those elements 
			if (sections < array.length) {
				System.out.println("STARTING OVER " + n );
				System.out.println("SECTIONS: " + sections);
				for (int s=0; s<sections; s++) {
					// get number of elements in each section
					// add one to make sure you don't miss any at the end
					int size = 1+Math.round((array.length)/sections);
					System.out.println("");
					System.out.println("SECTION: " + s);
					System.out.println("SIZE: " + size);
					//System.out.println(sections + " < " + array.length);
					
					//set pivot point for each section
					int pivot = (size*s + Math.round(size/2));
					if (pivot < array.length){ 
					System.out.println("PIVOT: array[" + pivot + "]::" +array[pivot]);
					System.out.println("");
					
					// iterate through each element in each section
					for (int i=0; i<size; i++) {
						int m = i+size*s;
						if (m < array.length ){
							
							System.out.println("array[" + m + "]: " + array[m]);
								
							int tmpLeft = 0;
							int tmpRight = 0;
							
						//	if (i<(size/2)) {
							if (m < pivot) {
								System.out.println("processing m:" + m);
								System.out.println("");
								
								if (array[m] > array[pivot]) {
									//if array element is bigger than pivot, put in tmp integer
									tmpRight = array[m];
									System.out.println("tmpRight is now this: " + array[m]);
									System.out.println("(size*(s+1)-2) is now this: " + (size*(s+1)-2));
									
									if ((size*(s+1)-2) == pivot) {
										int j = pivot;
										System.out.println("array[m]: " + array[m] + " pivot: " + array[pivot]);
										tmpLeft = array[pivot];
										array[pivot] = array[m];
										array[m] = tmpLeft;
										System.out.println(array[m] + " > " + array[pivot] + " = " + array[j]);
										}
									else {
									//look for an m > pivot to swap with
									for (int j=(size*(s+1)-2);j>(pivot);j--) {
										System.out.println("#############");
										System.out.println("j is: " + j);
								//		System.out.println("array[j] is: " + array[j]);
								//		System.out.println("");
										
										System.out.println("array[j]: " + array[j] + " pivot: " + array[pivot]);
										if (array[j] < array[pivot]) {
											System.out.println("array[j] < array[pivot] was invoked");
											array[m] = array[j];
											array[j] = tmpRight;
											
											System.out.println("");
											System.out.println(array[m] + " < " + array[pivot] + " < " + array[j]);
											break;
										}
										
									
										// if a suitable swap is not found left of pivot
										// swap with pivot
										//{61,60,62,64,58,66,56,59,57,60,53,55,54,50};
										else if (j==pivot){
											System.out.println("array[m]: " + array[m] + " pivot: " + array[pivot]);
											tmpLeft = array[pivot];
											array[pivot] = array[m];
											array[m] = tmpLeft;
											System.out.println(array[m] + " > " + array[pivot] + " = " + array[j]);
											
										// must run through this section again if pivot is swapped.
											i = -1;
										}
									}
									}
							//		for (int k : array){
								//		System.out.print(k + ",");
								//	}
								//	System.out.println("");
								}
								
								else if (array[m] < array[pivot]) {
									System.out.println("NO CHANGE: array[m]: " + array[m] + " pivot: " + array[pivot]);
									
								}
								else if (array[m] == array[pivot]) {
									System.out.println("PIVOT array[m]: " + array[m] + " pivot: " + array[pivot]);
								//	tmpArray.add(array[pivot+1]);
								}
								System.out.println("");
								
							}
						// now assume all elements on the left are in place
						// still need to clean up the right side
							//else if (i>(size/2)) {
							else if (m > pivot) {
								System.out.println("processing m:" + m);
								System.out.println("");
								
								if (array[m] < array[pivot]) {
									System.out.println(array[m] + " < " + array[pivot]);
									tmpRight = array[pivot];
									System.out.println("tmpRight is now: " + tmpRight);
									array[pivot] = array[m];
									array[m] = tmpRight;
									System.out.println("pivot was traded, and 's' was decremented");
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
							
						}
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
			
	

	

