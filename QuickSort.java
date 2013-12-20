//import java.util.ArrayList;
//import java.util.List;


public class QuickSort {

	int[] array = new int[] {61,60,62,64,58,66,56,59,59,57,60,53,55,54,50};
	//		46,51,49,48,44,45,43,41,40,42,35,39,31,28,33,32,37,38,23,21,22,19,15};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}	
		public int[] recursive () {
				
		for (int n=0; n<array.length-1;n++){
			//need to create a test here that will pass and print if all 
			//(array[n] > array[n+1]), or start another recursion if not	
			System.out.println("STARTING OVER " + n);

			//create distinct sections of the array
			int sections = (int) Math.pow(2,n);
			System.out.println("sections: " + sections);
				if (sections < array.length) {
					for (int s=0; s<sections; s++) {

					// get number of elements in each section
					int size = 1+Math.round((array.length)/sections);
					
					System.out.println("size is: " + size);
					System.out.println(sections + " < " + array.length);
					
						for (int a=0; a<size; a++) {
							int m = a+size*s;
							if (m < array.length ){
								System.out.println("array[" + m + "]: " + array[m]);
							}
						}			
					}	
				}
			
		}
		return array;
		
	}			
				
	public void print(int[] array) {
				for (int k : array){
					System.out.print(k + " ");
				}			
			}
		
	public void sort (int size, int[] array){
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
						for (int j=size-1;j>(pivot);j--) {
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
	}
}
			
	

	

