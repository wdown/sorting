
public class Sort {

	/**
	 * @param args
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {80,73,99,110,88,229,-77,230,45,61,60,62,10,64,58,1,60,62,49,64, //};
				58,66,56,59,-59,57,60,53,55,54,5015,35,39,-31,28,33,32,37,38,23,21,2,19,15, //};
				66,56,59,59,22,57,57,44,60,53,-55,54,50,46,51,49,48,44,45,43,41,40,42,35,39,31,
				208,33,312,37,38,23,21,22,119,15};

	//	int size = array.length;
		System.out.println("size: " + array.length);
		QuickSort(array, 0, array.length);
	}
	
	private static void QuickSort(int[] array, int start, int size ) {
		System.out.println("");
		System.out.println("STARTING OVER at start: " + start);	
		
		int front = start;
		int back = start+size-1;		
		//initialize variables to hold the size of arrays before and after pivot
		int frontSize = 0;
		int backSize = 0;				
		// zero is not safe since this refers to the value stored in the array
		int tmpFront = 0;
		int tmpBack  = 0;
//		1.  If the starting and ending places coincide, then this segment of the array 
//		only contains one element and must already be sorted. 
		if (size > 0) {
		
			System.out.println("///////////////////////////////////////");
			System.out.println("size is: " + size);
			System.out.println("back is: " + back);	
			System.out.println("///////////////////////////////////////");

//		If, however, the starting and ending positions do not coincide, then you 
//		arbitrarily select the first element in the segment (which is the one designated 
//		by the starting location) to be what you are (I think) terming the pivot element.
		
			while (front < back){
				System.out.println("front: " + front + " is < back: " + back);
				for (int a : array) {
					System.out.print(a + ",");
				}
				System.out.println("");
				System.out.println("");
//		2.  Set up a loop with Front pointing to the element just after the start of the 
//		current segment and Back pointing to the end of the current segment.  		
//		The loop should terminate when these two pointers meet or pass each other.  
//		The body of this loop looks like this:  				
//		     A.  Set up a loop which will increment Front while Front points to an element 
//		     less than or equal to the element in the start of the segment and Front does 
//		     not pass Back.  
				while (array[front] <= array[start] && front < back) {
					System.out.println("array[front] is <= array[start]: " + array[front] 
							+ "<=" + array[start]);
					front++;
					frontSize++;
					System.out.println("------------------------------------------------");
					System.out.println("FRONT:: " + front + ", frontSize:: " + frontSize);
				}
//			B.  Set up another loop which will decrement Back while Back points to an 
//			element greater than the element in the start of the segment and Back does not 
//			meet or pass Front.  
			while (array[back] >= array[start] && front < back) {
			System.out.println("array[back] is >= array[start]: " 
						+ array[back] + ">=" + array[start]);
				back--;
				backSize++;
				System.out.println("BACK:::: " + back + ", backSize:: " + backSize);
			}
//			    C.  If both of these embedded loops find elements to be moved, swap the elements.
			 	if (array[back] < array[start] && array[front] > array[start] && front < back) {
			 		System.out.println("SWAPPIN SOME STUFF ::::::::::::" + array[front] + ":::::::::::::::" 
			 				+ "::::::::::::" + array[back] );
			 		tmpBack = array[front];
			 		array[front] = array[back];
			 		array[back] = tmpBack;
			 		front++;
					frontSize++;
					back--;
					backSize++;
			 	}
			}
	
//		3.  Place the element at the start of the current segment where it belongs by 
//		swapping it which the appropriate element that should be where Front and Back meet 
//		give or take one position.
		System.out.println("");
		System.out.println("EXIT STRATEGY");
		System.out.println("FRONT:: " + front + " BACK:: " + back);
		System.out.println("FRONT::: " + array[front] + " BACK::: " + array[back]);
		if (front >= back ) {
		// if nothing needs to be moved either to front or back
			if (array[back] > array[start] && array[front] < array[start] ){
				tmpBack = array[start];
				array[start] = array[front+1];
				array[front+1] = tmpBack;
			}
			// if only something from the back needs to move to the front, swap with array[0] 
			else if (array[back] < array[start] && array[front] < array[start]) {
				tmpFront = array[back];
				array[back] = array[start];
				array[start] = tmpFront;
				backSize++;
			}		
			// if something from the front needs to move to the back, 
			// swap the element before tmpBack with array[0] 

			else if (array[back] > array[start] && array[front] > array[start]) {
				tmpBack = array[start];
				array[start] = array[front-1];
				array[front-1] = tmpBack;
				backSize++;
				frontSize--;	
			}
			for (int a : array) {
				System.out.print(a + ",");
			}
			System.out.println("");

		}
//		4.  Call the recursive method passing it the array, the starting position of the 
//		segment of the array, and the position just before the location where the element 
//		was placed that was previously at the starting position of the current segment.  
//		This is done provided the new starting position is bigger than the new ending 
//		position.
		QuickSort(array, start, frontSize);

//		5.  Call the recursive method passing it the array, the position just after the 
//		location where the element was placed that was previously at the starting position 
//		of the current segment, and the ending position of the current segment.  This is 
//		also provided the new starting position is bigger than the new ending position. 
		QuickSort(array, back, backSize);

		}
	} // end (if size > 0)
} // end main

