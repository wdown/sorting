//import java.util.ArrayList;
//import java.util.List;


public class QuickSort {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {61,60,62,64,58,66,56,59,59,57,60,53,55,54,50};
		//		46,51,49,48,44,45,43,41,40,42,35,39,31,28,33,32,37,38,23,21,22,19,15};
		
	//	int[] array = new int[] {22,77,15,21,19};
		
		//int set = array.length;
		
		
		for (int n=1; n<array.length-1;n++){
		//	if (array[n] > array[n+1]) {

//		int n = 0;
		System.out.println("STARTING OVER " + n);
		//int sections = (int) Math.pow(2,n);
		int sections = n;

		// get number of elements in each section
		int size = (array.length)-1/sections;
		
		//int nextChunk = array[array.length-size
		//while (sections <= size) {
			System.out.println("number of sections: " + sections);
			System.out.println("array length is: " + array.length);
		//	System.out.println("chunk is: " + chunk);
			System.out.println("size is: " + size);

			// define working set
			//set = 
	
		//set pivot point for each section
		int pivot = (size/2)+1;
		System.out.println("pivot is: " + array[pivot]);
		System.out.println("");
	
			for (int i=0; i<size; i++){
				int tmpLeft = 0;
				int tmpRight = 0;
			
				if (i<=(size/2)) {
					System.out.println("processing i:" + i);
					System.out.println("");
					
					if (array[i] > array[pivot]) {
						//if array element is bigger than pivot, put in tmp integer
						tmpRight = array[i];
						System.out.println("tmpRight is now: " + array[i]);
						//look for an i > size/2 to swap with
						for (int j=size;j>(pivot);j--) {
							System.out.println("j is: " + j);
							System.out.println("array[j] is: " + array[j]);
							for (int k : array){
								System.out.print(k + ",");
							}
							
							System.out.println("");
							
							System.out.println("array[j]: " + array[j] + " pivot: " + array[pivot]);
							if (array[j] < array[pivot]) {
								System.out.println("array[j] < array[pivot] was invoked");
								array[i] = array[j];
								array[j] = tmpRight;
								for (int k : array){
									System.out.print(k + ",");
								}
								System.out.println("");
								System.out.println(array[i] + " < " + array[pivot] + " < " + array[j]);
								break;
							}
							
						
							// if a suitable swap is not found left of pivot
							// swap with pivot
							//{61,60,62,64,58,66,56,59,57,60,53,55,54,50};
							else if (j==pivot){
								System.out.println("array[i]: " + array[i] + " pivot: " + array[pivot]);
								tmpLeft = array[(size/2)+1];
								array[(size/2)+1] = array[i];
								array[i] = tmpLeft;
								System.out.println(array[i] + " > " + array[pivot] + " = " + array[j]);
							}
						}	
					}
					
					else if (array[i] < array[pivot]) {
						System.out.println("NO CHANGE: array[i]: " + array[i] + " pivot: " + array[pivot]);
						
					}
					else if (array[i] == array[pivot]) {
						System.out.println("PIVOT array[i]: " + array[i] + " pivot: " + array[pivot]);
					//	tmpArray.add(array[pivot+1]);
					}
					
				}
			// now assume all elements on the left are in place
			// still need to clean up the right side
				else if (i>(size/2)) {
					System.out.println("processing i:" + i);
					System.out.println("");
					
					if (array[i] < array[pivot]) {
					//	array[i] = array[(size/2+2)];
						System.out.println(array[i] + " < " + array[pivot]);

						tmpRight = array[pivot];
						System.out.println("tmpRight is now: " + tmpRight);
						array[pivot] = array[i];
						array[i] = tmpRight;
						System.out.println(array[i] + " is now greater than: " + array[pivot]);
				
					
					
					}
					else if (array[i] > array[pivot]) {
						System.out.println(array[i] + " is greater than: " + array[pivot] + " NO CHANGE");
						//tmpArray.add(array[pivot-1]);
					}
					else if (array[i] == array[pivot]) {
						System.out.println(array[i] + " is pivot");
					}
				}
				
			}
		//	n++;
		}
			
			

		//	System.out.println("");
		
	/*
				if (j > j+1) {
					System.out.println("you failed to sort this array");
				}
				else {
				*/
			//	System.out.print(n + ",");
				for (int k : array){
					System.out.print(k + ",");
				}
				System.out.println("");
				
			}
	
//	}
}
